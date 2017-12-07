package com.shen.think.innerclass;

/**
 * Created by ljq on 2017/12/6.
 */

public class Main {


    public void test(){

        InnerClass innerClass = new InnerClass();
        /**
         * 非静态内部类的实例创建需要依赖外部对象实例
         */
        InnerClass.Destination d = innerClass.new Destination("ss");

        d.readLabel();
    }

    public static void main(String[] args){



        InnerClass innerClass = new InnerClass();

        /**
         * 由于Contents在InnerClass类中定义为private，所以无以通过下面代码，创建实例
         */
        // InnerClass.Contents contents = innerClass.new Contents();

        /**
         * 非静态内部类的实例创建需要依赖外部对象实例
         */
        InnerClass.Destination d = innerClass.new Destination("shenjianli");
        System.out.println(d.readLabel());



        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.test();

        /**
         * 静态内部类的实例创建不需要依赖外部对象实例，
         * 因此无法使用这种StaticInnerClass.StaticClass staticClass = staticInnerClass.new StaticClass();
         * 方式创建静态内部类的实例，可使用下面方式创建静态内部类的实例
         */
        StaticInnerClass.StaticClass staticClass = new StaticInnerClass.StaticClass();
        staticClass.innerTest();

        StaticInnerClass.StaticClass.innerStaticTest();


        /**
         * 通过外部类来创建继承的内部类对象实例
         */
        InheritInner inheritInner = new InheritInner(innerClass,"shenjianli");
        inheritInner.readLabel();

    }
}
