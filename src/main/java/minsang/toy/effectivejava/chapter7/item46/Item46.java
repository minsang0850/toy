package minsang.toy.effectivejava.chapter7.item46;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Item46 {

    public void execute () {
//        Map<String, Long> freq = new HashMap<>();
//        try(Stream<String> words = new Scanner(file).tokens()){
//            words.forEach(word -> {
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//        }
//        try(Stream<String> words = new Scanner(file).tokens()){
//            freq = words
//                    .collect(groupingBy(String::toLowerCase, counting()));
//        }
        var words = new ArrayList<String>();
//        words.stream().collect(groupingBy(word -> alphabetize(word));
        Map<String, Long> freq = words.stream()
                .collect(groupingBy(String::toLowerCase, counting()));

    }

    public void partitioningBy(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 홀수와 짝수로 분할
        Map<Boolean, List<Integer>> evenOddPartition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
