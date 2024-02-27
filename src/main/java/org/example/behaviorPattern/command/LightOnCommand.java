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
public class LightOnCommand implements Command{
    Light light;

    //set receiver
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
