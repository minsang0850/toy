package minsang.toy.designpattern.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        //remote 변수가 인보커(Invoker) 역할
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        //커맨드 객체를 인보커에 전달
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
