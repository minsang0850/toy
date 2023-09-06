package minsang.toy.designpattern.observer;

public class ConcreteObserver implements Observer{
    private int data;

    @Override
    public void update(int data) {
        this.data = data;
    }
}
