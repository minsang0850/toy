package minsang.toy.designpattern.strategy;

public class muteDuckWithWings extends Duck{

    public muteDuckWithWings() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }
}
