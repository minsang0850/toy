package minsang.toy.effectivejava.chapter7.item48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelStreamExampleTest {

    @Test
    void test() {
        var startTime = System.nanoTime();
        ParallelStreamExample.pi(100000000);
        var endTime = System.nanoTime();

        var startTimeParallel = System.nanoTime();
        ParallelStreamExample.parallelPi(100000000);
        var endTimeParallel = System.nanoTime();

        System.out.println("pi: " + (endTime - startTime)); //156053452958
        System.out.println("parallel pi: " + (endTimeParallel - startTimeParallel)); //29409031000
    }

}