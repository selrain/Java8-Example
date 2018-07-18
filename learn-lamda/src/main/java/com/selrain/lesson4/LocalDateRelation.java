package com.selrain.lesson4;

import org.junit.Test;

import java.time.LocalDate;

/**
 * @Author serlain
 * @Date 2018/7/16 下午10:38
 */
public class LocalDateRelation {
    @Test
    public void getCurDate() {
        System.out.println(LocalDate.now());
    }

    @Test
    public void getFixDate() {
        System.out.print(LocalDate.parse("2017-07-28"));
        System.out.println(LocalDate.of(2017, 12, 30));
    }
    @Test
    public void addDay(){
        System.out.println(LocalDate.now().plusDays(1));
    }

    @Test
    public void judgeIsLeap(){
        System.out.println(LocalDate.now().isLeapYear());
    }
}
