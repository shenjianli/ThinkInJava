package com.shen.think.classtest;

/**
 * Created by ljq on 2017/12/17.
 */

public class SingleTon {

    private static SingleTon singleTon = new SingleTon();
    public static int count1;
    public static int count2 = 0;

    private SingleTon() {
        count1++;
        count2++;
    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
