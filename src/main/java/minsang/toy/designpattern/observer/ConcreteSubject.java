package minsang.toy.designpattern.observer;

import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private int data;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(data);
        }
    }
}
