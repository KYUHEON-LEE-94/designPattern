package org.example.constructorPattern.composite.mvc.model;

import org.example.constructorPattern.composite.mvc.observer.BPMObserver;
import org.example.constructorPattern.composite.mvc.observer.BeatObserver;

/**
 * packageName    : org.example.constructorPattern.composite.mvc
 * fileName       : BeatModelInterface
 * author         : heon
 * date           : 2024-03-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12           heon               최초 생성
 */
public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    // 모델은 옵저버 패턴을 사용한다.
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
