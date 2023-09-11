package minsang.toy.designpattern.decorator;

//Condiment == 첨가물
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
