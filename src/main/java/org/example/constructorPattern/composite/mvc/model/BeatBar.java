package org.example.constructorPattern.composite.mvc.model;

import javax.swing.*;

/**
 * packageName    : org.example.constructorPattern.composite.mvc
 * fileName       : BeatBar
 * author         : heon
 * date           : 2024-03-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12           heon               최초 생성
 */
//JProgressBar: Java Swing 컴포넌트 중 하나로, 진행 상태를 시각적으로 표시하는 데 사용
public class BeatBar extends JProgressBar implements Runnable{
    private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};
        }
    }
}
