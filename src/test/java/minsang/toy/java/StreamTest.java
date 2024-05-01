package minsang.toy.java;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.List;


public class StreamTest {
    @Test
    void lazyTest() {
        List.of(1, 20, 30)
                .stream()
                .peek(System.out::println)
                .peek(System.out::println)
                .map(a->a+1)
                .peek(System.out::println)
                .sorted()
                .peek(System.out::println)
                .peek(System.out::println)
                .forEach(System.out::println);
    }
}
