package org.example.constructorPattern.proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * packageName    : org.example.constructorPattern.proxy.virtual
 * fileName       : ImageProxy
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
class ImageProxy implements Icon {

    // Java 변수를 Main Memory에 저장하겠다라는 것을 명시
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        imageURL = url; // 이미지 로딩이 끝나면 이 URL에 있는 이미지를 화면에 표시
    }

    // 중략

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    // 이미지 출력
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        // (1) 이미지가 완전히 생성되었을 경우
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        }
        // (2) 이미지가 아직 완전히 생성되지 않았을 경우
        else {
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);

            // 이미지를 가져오고 있는 중이 아니라면
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    try {
                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                        c.repaint(); // 화면 갱신
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
