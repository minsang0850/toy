package minsang.toy.effectivejava.chapter8.item52;

import java.util.List;

class Wine{
    String name() {return "포도주";}
}

class SparklingWine extends Wine{
    @Override String name() {return "발포성 포도주";}
}
class Champagne extends SparklingWine{
    @Override String name() {return "샴페인";}
}

class MyClass1 {
    public void printMessage(String message) {
        System.out.println("Message from MyClass1: " + message);
    }
}

class MyClass2 {
    public void printMessage(String message, int count) {
        System.out.println("Message from MyClass2: " + message + ", Count: " + count);
    }
}

public class Overriding_item52 {
    public static void main(String[] args) {
        List<Wine> wines = List.of(new Wine(), new SparklingWine(), new Champagne());
        for (Wine wine : wines){
            System.out.println(wine.name());
        }

        MyClass1 obj1 = new MyClass1();
        MyClass2 obj2 = new MyClass2();

        obj1.printMessage("Hello"); // No issue

        // The following line would trigger a compiler warning with -Xlint:overloads
        obj2.printMessage("Hello", 3); // Warning about potential overload confusion
    }
}
