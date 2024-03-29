package minsang.toy.effectivejava.chapter7.item44;

import java.util.Map;
import java.util.concurrent.ExecutorService;

@FunctionalInterface
public interface EldestEntryRemovalFunction<K,V>{
    boolean remove(Map<K,V> map, Map.Entry<K,V> eldest);
}
