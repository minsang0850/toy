package minsang.toy.spring.caffeine;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CaffeineCacheService {

    public int nonCacheMethod() throws InterruptedException {
        Thread.sleep(1000);
        return 1;
    }

    @Cacheable
    public int cacheMethod() throws InterruptedException {
        Thread.sleep(1000);
        return 1;
    }
}
