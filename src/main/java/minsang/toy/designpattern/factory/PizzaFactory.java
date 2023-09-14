package minsang.toy.designpattern.factory;

public class PizzaFactory {

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesePizza();
        }
        if(type.equals("Potato")){
            return new PotatoPizza();
        }
        return null;
    }
}
