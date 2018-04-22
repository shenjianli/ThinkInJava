package com.shen.think.innerclass;

/**
 * Created by ljq on 2017/12/6.
 */

public class StaticInnerClass {

    private static int a = 100;

    private int b = 101;

    public void test(){
        System.out.println(b);
    }

    public static void staticTest(){
        System.out.println(a);
    }

    /**
     * 静态内部类
     */
    static class StaticClass{

        private int c = 0;

        public static void innerStaticTest(){
            /**
             * System.out.print(b); 这句代码中的b无法使用，
             * 因为：静态内部类只能够引用外部类中的静态成员方法或者成员变量
             */
            // !NO System.out.print(b);
            System.out.println(a);
            // !NO test();
            staticTest();
        }

        public void innerTest(){
            /**
             * System.out.print(b); 这句代码中的b无法使用，
             * 因为：静态内部类只能够引用外部类中的静态成员方法或者成员变量
             */
            // !NO System.out.print(b);
            System.out.println(a);
            /**
             * test(); 这句代码中的test方法无法使用，
             * 因为：静态内部类只能够引用外部类中的静态成员方法或者成员变量
             */
            // !NO test();
            staticTest();
        }
    }

    public static void main(String[] args){
        /**
         * 静态内部类的实例创建不需要依赖外部对象实例
         */
        StaticClass staticClass = new StaticClass();
        System.out.println(staticClass.c);
    }
}
