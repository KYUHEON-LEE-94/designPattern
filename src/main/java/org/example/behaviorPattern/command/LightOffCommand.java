package org.example.behaviorPattern.command;

/**
 * packageName    : org.example.behaviorPattern.command
 * fileName       : LightOnCommand
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class LightOffCommand implements Command{
    Light light;

    //set receiver
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
