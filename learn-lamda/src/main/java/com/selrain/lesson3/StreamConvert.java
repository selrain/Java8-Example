package com.selrain.lesson3;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author serlain
 * @Date 2018/7/16 上午7:40
 */
public class StreamConvert {
    @Test
    public void distinct() {
        Stream.of(1, 1, 2, 3, 4, 5).distinct().forEach(System.out::println);
    }

    @Test
    public void filter() {
        Stream.of(1, null, 3, 4).filter(n -> n != null).forEach(System.out::println);
    }

    @Test
    public void map() {
        List<Integer> ss = Stream.of(1, 2, 3).map(x -> x + 1).collect(Collectors.toList());
        System.out.println(ss);
    }

    @Test
    public void flatmap() {
        Stream.of(1, 2, 3).flatMap(x -> Stream.of(1, 3)).forEach(System.out::println);
    }

    @Test
    public void limitAndSkip() {
        IntStream.range(1, 100).limit(10).skip(5).forEach(System.out::println);
    }

    @Test
    public void reduce() {
        int Sum = IntStream.range(1, 10).reduce((sum, item) -> sum + item).getAsInt();
        System.out.println(Sum);
    }

}
