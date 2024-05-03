package minsang.toy.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompletableFutureTest {

    private final CompletableFutureMethod completableFutureMethod;

    CompletableFutureTest(@Autowired CompletableFutureMethod completableFutureMethod) {
        this.completableFutureMethod = completableFutureMethod;
    }

    @Test
    void futureTest() {
        completableFutureMethod.caculateWithFuture(200);
    }

    @Test
    void withoutFutureTest() {
        completableFutureMethod.caculateWithoutFuture(100);
    }
}
