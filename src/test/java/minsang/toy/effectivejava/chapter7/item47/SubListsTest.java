package minsang.toy.effectivejava.chapter7.item47;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class SubListsTest {

    @Test
    void test(){
        var src = List.of(1, 2, 3);
        for(int start = 0; start < src.size(); start++){
            for(int end = start +1; end <= src.size(); end ++){
                System.out.println(src.subList(start, end));
            }
        }
    }
}