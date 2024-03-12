package org.example.constructorPattern.composite.mvc.controller;

import org.example.constructorPattern.composite.mvc.model.BeatModelInterface;
import org.example.constructorPattern.composite.mvc.view.DJView;

/**
 * packageName    : org.example.constructorPattern.composite.mvc.controller
 * fileName       : BeatController
 * author         : heon
 * date           : 2024-03-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12           heon               최초 생성
 */
public class BeatController implements ControllerInterface{
    BeatModelInterface model;
    DJView view;

    // 뷰를 생성하고, 인자로 model을 받아온다.
    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    // 사용자의 입력에 따라 적절한 처리를 해준다.
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
