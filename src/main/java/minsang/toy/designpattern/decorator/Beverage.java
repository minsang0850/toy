package minsang.toy.designpattern.decorator;

//인터페이스 사용해도 무방
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
