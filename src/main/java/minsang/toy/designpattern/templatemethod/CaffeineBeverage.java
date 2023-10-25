package minsang.toy.designpattern.templatemethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {
        //물 끓이기
    }

    private void pourInCup() {
        //컵에 따르기
    }
}
