package com.selrain.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author serlain
 * @Date 2018/7/15 下午10:33
 */
public class CreateSteam {
    public static void main(String[] args) {
        //静态方法创建：
        List<Double> doubleList = Stream.of(1, 2, 3, 4).mapToDouble(i -> i.doubleValue()).
                collect(ArrayList::new, ArrayList::add, (list, list1) -> list.addAll(list1));
        doubleList.forEach(System.out::println);
        //generate 方法
        Stream.generate(Math::random).limit(3).forEach(System.out::println);
        //iterate
        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
        //Collection 子类获取
    }
}
