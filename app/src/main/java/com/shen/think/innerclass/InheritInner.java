package com.shen.think.innerclass;

/**
 * Created by ljq on 2017/12/6.
 */

/**
 * 继承内部类
 * InheritInner 只对内部类Destination进行了扩展，没有扩展外部类
 */
public class InheritInner extends InnerClass.Destination{

    String ss = "ss";

    /**
     * 构造函数需要传入  Destination 类的外部类实现，来构造继承的内部类
     * @param innerClass 继承内部类的外部类实例
     * @param str 继承内部类需要的参数
     */
    InheritInner(InnerClass innerClass, String str) {
        /**
         * 继承内部类的构造器必须使用这样的语法
         */
        innerClass.super(str);
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        /**
         * 通过外部类来创建继承的内部类对象实例
         */
        InheritInner inheritInner = new InheritInner(innerClass,"shenjianli");
        inheritInner.readLabel();
    }
}
