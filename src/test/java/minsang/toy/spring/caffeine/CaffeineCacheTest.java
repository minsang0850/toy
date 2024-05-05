package minsang.toy.spring.caffeine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CaffeineCacheTest {

    private final CaffeineCacheService caffeineCacheService;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public CaffeineCacheTest(@Autowired CaffeineCacheService caffeineCacheService) {
        this.caffeineCacheService = caffeineCacheService;
    }

    @Test
    void cacheTest() throws InterruptedException {

        var start = LocalDateTime.now();
        for (int i=0; i<10; i++){
            caffeineCacheService.cacheMethod();
        }
        var end = LocalDateTime.now();
        System.out.println("start:" + start.format(formatter));
        System.out.println("end:" + end.format(formatter));
    }

    @Test
    void nonCacheTest() throws InterruptedException {

        var start = LocalDateTime.now();
        for (int i=0; i<10; i++){
            caffeineCacheService.nonCacheMethod();
        }
        var end = LocalDateTime.now();
        System.out.println("start:" + start.format(formatter));
        System.out.println("end:" + end.format(formatter));
    }

}