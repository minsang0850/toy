package minsang.toy.designpattern.command;

//인보커(Invoker)
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {}

    //제어할 명령을 설정하는 메소드
    public void setCommand(Command command){
        slot = command;
    }

    //버튼을 누르면 해당 메소드 호출
    public void buttonWasPressed() {
        slot.execute();
    }
}
