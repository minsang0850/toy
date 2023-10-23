package minsang.toy.designpattern.adapter;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
