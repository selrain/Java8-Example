package com.selrain.lesson4;

import org.junit.Test;

import java.time.LocalDate;
import java.time.MonthDay;

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

    @Test
    public void dateCompare(){
        System.out.println(LocalDate.now().equals(LocalDate.parse("2018-07-22")));
    }

    /**
     * 检查是否是某人的生日
     */
    @Test
    public void birthCheck(){
        LocalDate dateOfBirth = LocalDate.of(2018, 07, 22);
        MonthDay monthDay=MonthDay.from(dateOfBirth);

        LocalDate localDate=LocalDate.now();
        MonthDay monthDay1=MonthDay.of(localDate.getMonth(),localDate.getDayOfMonth());

        System.out.println(monthDay.equals(monthDay1));
    }
}
