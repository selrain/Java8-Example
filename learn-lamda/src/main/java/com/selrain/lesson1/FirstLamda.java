package com.selrain.lesson1;

import org.junit.Test;

import java.util.function.BinaryOperator;

/**
 * @Author serlain
 * @Date 2018/7/4 下午10:49
 */
public class FirstLamda {

    @Test
    public void oldThread() throws InterruptedException{
        Runnable r=new Runnable() {
            public void run() {
                System.out.println("i am a thread");
            }
        };
        new Thread(r).start();
        Thread.sleep(1000);
    }


    @Test
    public void lamdaThread() throws InterruptedException{
        Runnable r=()-> System.out.println("i am a thread");
        new Thread(r).start();
        Thread.sleep(1000);
    }
    @Test
    public void multiParam(){
        BinaryOperator<Integer> function =(x,y)->(x+y);
        System.out.println(function.apply(5,6));
    }
}
