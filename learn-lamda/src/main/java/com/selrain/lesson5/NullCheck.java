package com.selrain.lesson5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NullCheck {
    /**
     *   Objects类添加了两个静态方法isNull和nonNull，在使用流的时候非常有用。
     */
    @Test
    public void ObjectNullCheck(){
        Stream.of("a", "c", null, "d")
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
    @Test
    public void CheckUser(){
        User user=new User("selrain");
        Optional optional= Optional.ofNullable(user).map(User::getUserName);
        optional.orElse("");

        List<String> strings=IntStream.range(1,10).mapToObj(x->String.valueOf(x)).collect(Collectors.toList());
        Optional.of(strings).filter(Objects::nonNull).ifPresent(System.out::println);
    }
}
