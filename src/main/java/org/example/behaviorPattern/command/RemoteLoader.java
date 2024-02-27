package org.example.behaviorPattern.command;

/**
 * packageName    : org.example.behaviorPattern.command
 * fileName       : commandTest
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //receiver object
        Light livingRoomLight = new Light("Living Room");
        //command object
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        //save command object to invoker
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        //test - request work
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        Command[] partyOn = {livingRoomLightOn};
        Command[] partyoff = {livingRoomLightOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyoff);
    }
}
