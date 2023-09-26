package minsang.toy.designpattern.command;

//조명을 켤 때 필요한 커맨드 클래스
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
