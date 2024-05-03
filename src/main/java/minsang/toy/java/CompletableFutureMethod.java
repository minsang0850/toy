package minsang.toy.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class CompletableFutureMethod {

    private final Logger log = LoggerFactory.getLogger(getClass());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public List<Integer> caculateWithoutFuture(int size) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        var start = LocalDateTime.now();
        var result = list.stream()
                .map(this::getNewNumber)
                .toList();
        var end = LocalDateTime.now();
        System.out.println("start:" + start.format(formatter));
        System.out.println("end:" + end.format(formatter));
        return result;
    }

    public List<Integer> caculateWithFuture(int size) {
        var tp = Executors.newFixedThreadPool(100);
        var list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        var start = LocalDateTime.now();
        var futures = list.stream()
                .map(num->getNewNumberFuture(num, tp))
                .toList();
        var result = futures.stream().map(future -> {
            try {
                return future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        var end = LocalDateTime.now();
        System.out.println("start:" + start.format(formatter));
        System.out.println("end:" + end.format(formatter));
        return result;
    }

    private CompletableFuture<Integer> getNewNumberFuture(Integer integer, ExecutorService tp) {
        return CompletableFuture.supplyAsync(() -> getNewNumber(integer), tp);
    }

    private Integer getNewNumber(Integer integer) {
        try {
            log.info("" + integer);
            Thread.sleep(1000);
            return integer * 2;
        } catch (Exception e) {
            return 0;
        }
    }
}
