package com.shen.think.classtest;

/**
 * Created by ljq on 2017/12/17.
 */

public class ClassTest {

    public static String a = "100";


    public static String d = a + " dddd";
    static {
        System.out.println("static " + a);
        //不能调用 非法的引用，b没有定义
        //System.out.println(b);
        print();
        printAfterInit();
        a = "aaa" ;

        printE();
    }

    private static void printE() {
        System.out.println(" printE " + e);
    }

    public static String e = a + " dddd";

    /**
     * 方法可以调用，因为其是在初始化后才执行
     */
    public static void print(){
        System.out.println(a);
        System.out.println(b); //null
        System.out.println(c); //null
        System.out.println(d); //null
    }

    public static String b = "200";

    public static String c =  b + "300";

    /**
     * 方法可以调用，因为其是在初始化后才执行
     */
    public static void printAfterInit(){
        System.out.println(a);
        System.out.println(b); //null
        System.out.println(c); //null
    }

    public static void main(String[] args){
        printE();


        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);

    }
}
