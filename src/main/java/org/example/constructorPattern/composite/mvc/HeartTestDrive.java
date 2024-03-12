package org.example.constructorPattern.composite.mvc;

import org.example.constructorPattern.composite.mvc.controller.BeatController;
import org.example.constructorPattern.composite.mvc.controller.ControllerInterface;
import org.example.constructorPattern.composite.mvc.model.BeatModel;

/**
 * packageName    : org.example.constructorPattern.composite.mvc
 * fileName       : HeartTestDrive
 * author         : heon
 * date           : 2024-03-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12           heon               최초 생성
 */
public class HeartTestDrive {
    public static void main (String[] args) {
        BeatModel beatModel = new BeatModel();
        ControllerInterface model = new BeatController(beatModel);
    }
}
