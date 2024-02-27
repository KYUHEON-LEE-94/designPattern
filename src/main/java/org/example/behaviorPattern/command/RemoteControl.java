package org.example.behaviorPattern.command;

/**
 * packageName    : org.example.behaviorPattern.command
 * fileName       : RemoteControl
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    //on-off쌍의 버튼이 7쌍이 있다고 해 봅시다.
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands= new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // 커맨드 객체를 각 리모콘의 슬롯에 저장.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if(onCommands[slot] != null){
            onCommands[slot].execute();
        }
    }

    public void offButtonWasPushed(int slot) {
        if(offCommands[slot] != null){
            offCommands[slot].execute();
        }
    }

    public void indoButtonWasPushed(){
        undoCommand.undo();
    }
}
