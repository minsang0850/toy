package minsang.toy.effectivejava.chapter6.item39;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)  //1. 매개변수로 전달
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}


