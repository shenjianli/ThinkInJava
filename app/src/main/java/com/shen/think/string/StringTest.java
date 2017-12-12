package com.shen.think.string;

/**
 * Created by ljq on 2017/12/12.
 */

public class StringTest {



    public static String addStr(String ss){

        ss = ss + "world";
        System.out.println(ss);

        return ss;
    }

    public static String addStr1(String ss){
        String s1 = "world";
        return ss + s1;
    }

    public static void main(String[] args){
        String s1 = "hello";
        System.out.println(addStr(s1));
        System.out.println(addStr1(s1));


        /**
         * JVM为了提高性能和减少内存开销，内部维护了一个字符串常量池，
         * 每当创建字符串常量时，JVM首先检查字符串常量池，如果常量池中已经存在，则返回池中的字符串对象引用，否则创建该字符串对象并放入池中。
         */
        String a = "abc";
        String b = "abc";
        System.out.print(a == b); //true


        String a1 = "Hello";
        String b1 = new String("Hello");
        /**
         * 当使用new String(String str)方式等创建字符串对象时，
         * 不管字符串常量池中是否有与此相同内容的字符串，都会在堆内存中创建新的字符串对象。
         */
        System.out.println(a1 == b1);  //false
        /**
         * 内容比较，为true
         */
        System.out.println(a1.equals(b1)); //true


        method_intern();

        method_optional_contant();

        method_add_method();

        method_new_method();
    }

    /**
     * 第一，行1 字符串池中的“hello”对象。
     * 第二，行1，在堆内存中带有值“hello”的新字符串。
     * 第三，行2，在堆内存中带有“hello”的新字符串。这里“hello”字符串池中的字符串被重用。
     */
    private static void method_new_method() {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println("method_new: " + (s1 == s2) );
    }

    /**
     * 字符串串联是通过 StringBuilder（或 StringBuffer）类及其 append 方法实现的，字符串转换是通过 toString 方法实现的
     */
    private static void method_add_method() {
        String s1="ab";
        String s2="abc";
        String s3=s1+"c";
        System.out.println("method_add_method: " + (s3==s2));
        System.out.println("method_add_method: " + s3.equals(s2));
        /**
         * 先在常量池中创建”ab“，地址指向s1,再创建”abc”，指向s2。
         * 对于s3，先创建StringBuilder（或 StringBuffer）对象，通过append连接得到“abc”,再调用toString()转换得到的地址指向s3。故(s3==s2)为false.
         */
        /*output：
        false
        true
        */
    }

    /**
     * java中常量优化机制，编译时s1已经成为“abc”在常量池中查找创建，s2不需要再创建。
     */
    private static void method_optional_contant() {
        String s1="a"+"b"+"c";
        String s2="abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        /*output：
        true
        true
        */
    }

    /**
     * intern()方法返回字符串对象在字符串常量池中的对象引用，
     * 若字符串常量池中尚未有此字符串，则创建一新的字符串常量放置于池中。
     */
    private static void method_intern() {


        String a = "Hello";
        System.out.println(a == a.intern()); //true



        /**
         * 这里创建的对象是在堆中，而不在常量池中
         */
        String b = new String("corn");
        /**
         * b.intern()会在常量池中创建新的对象，c指向的是常量池中的对象
         */
        String c = b.intern();
        System.out.println(b == c); //false


        /**
         * 从常量池中获取对象
         */
        String d = "corn";
        System.out.println(c == d); //true
    }
}


/**
 * 通过上面String类的定义，类名前面用了final class修饰，因此，String类不能被继承。
 * 对于其属性定义，属性value[]和hash都是被定义成private类型，且由于没有提供对外的public setters方法，String类属性不可被改变。
 * 需要重点关注属性value[]，其被final char修饰，因此字符型数组value只会被赋值一次就不可修改。其存储内容正好是String中的单个字符内容。
 *
 *
 * JVM为了提高性能和减少内存开销，内部维护了一个字符串常量池，
 * 每当创建字符串常量时，JVM首先检查字符串常量池，如果常量池中已经存在，则返回池中的字符串对象引用，否则创建该字符串对象并放入池中。
 *
 * 当使用new String(String str)方式等创建字符串对象时，不管字符串常量池中是否有与此相同内容的字符串，都会在堆内存中创建新的字符串对象。
 *
 *
 *
 * String是不可变字符串对象，StringBuilder和StringBuffer是可变字符串对象（其内部的字符数组长度可变），
 * StringBuilder非线程安全，StringBuffer线程安全。
 */