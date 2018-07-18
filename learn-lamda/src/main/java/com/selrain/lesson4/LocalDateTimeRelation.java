package com.selrain.lesson4;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author serlain
 * @Date 2018/7/16 下午10:47
 */
public class LocalDateTimeRelation {
    @Test
    public void getTime() {
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void getTime1() {
        System.out.println(LocalDateTime.of(2017, 12, 31, 12, 12));
        System.out.println(LocalDateTime.parse("2017-12-31T12:20"));
    }

    @Test
    //格式化
    public void format() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        System.out.println(LocalDateTime.parse("2017-12-31 12:20:25", dateTimeFormatter));
    }

    @Test
    public void dateConvert() {
        Instant instant = Instant.now();
        Date date = Date.from(instant);
        System.out.println(date.toString());


        Instant instant1 = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant();
        Date.from(instant1);

        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        System.out.println(ZoneId.systemDefault());
    }
}
