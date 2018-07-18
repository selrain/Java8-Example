package com.selrain.lesson1;

import org.junit.Test;

/**
 * @Author serlain
 * @Date 2018/7/4 下午10:49
 */
public class FirstLamda {

    @Test
    public void oldThread(){
        Runnable r=new Runnable() {
            public void run() {
                System.out.println("i am a thread");
            }
        };
        new Thread(r).start();
    }


    @Test
    public void lamdaThread(){
        Runnable r=()-> System.out.println("i am a thread");
        new Thread(r).start();
    }
}
