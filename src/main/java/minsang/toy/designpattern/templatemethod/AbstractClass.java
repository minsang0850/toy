package minsang.toy.designpattern.templatemethod;

//추상 클래스로 선언되므로 서브클래스를 만들어야 함
public abstract class AbstractClass {

    //템플릿 메소드
    //알고리즘의 각 단계를 건드리지 못하게 final로 선언
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    //서브 클래스에서 구현
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    private void concreteOperation() {
        // 메소드 코드
    }

    //구상 메소드이지만 기능 X -> 서브클래스에서 오버라이드 할 수도 있고, 그러지 않아도 괜찮음
    private void hook() {
    }
}
