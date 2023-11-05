package minsang.toy.effectivejava.chapter6.item39;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//1. 컨테이너 애너테이션
//3 @Retention, @Target 명시
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTestContainer {
    ExceptionTest[] value();  //2. 내부 애너테이션 타입의 배열을 반환하는 value 메서드 정의
}

