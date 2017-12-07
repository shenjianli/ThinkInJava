package com.shen.think.innerclass;

/**
 * Created by shenjianli on 2017/12/6.
 */

public class InnerClass {

    private static int a = 100;

    private int b = 101;

    /**
     * 1.非静态内部类,由于设置为private所以这个类
     * 只有在其外部类InnerClass中可以使用
     */
    private class Contents {

        private int i = 11;
        /**
         * 在非静态内部类中不可以声明静态成员
         */
        // private static int bb = 100;

        /**
         * 内部类Contents拥有对封装类InnerClass所有元素的访问权限
         * @return
         */
        public int value() { return i + b + a; }
    }
    /**
     * 2.非静态内部类，由于设置为protected，所以这个类可以在同包及继承使用
     */
    protected class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    /**
     * 外部类使用内部类的方式和普通的使用方式没有区别
     * @param dest
     */
    public void ship(String dest) {
        Contents c = new Contents();
        System.out.println(c.value());
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    /**
     * 外部类拥有一个特殊的方法，它会返回指向一个内部类的引用
     * @return 内部类引用
     */
    public Contents getContents(){
        Contents contents = new Contents();
        return contents;
    }

    /**
     * 内部类 InnerTest 被设为 private，所以除了 InnerClass 之外，其他任何东西都不能访问它
     *
     * 利用private内部类，类设计人员可完全禁止其他人依赖类型编码，并可将具体的实施细节完全隐藏起来。
     * 从客户程序员的角度来看，一个接口InnerInterface的范围没有意义的，因为他们不能访问不属于公共接口类InnerTest的任何额外方法
     */
    private class InnerTest implements InnerInterface{

        @Override
        public void print() {
            System.out.println("内部类 InnerTest 被设为 private，所以除了 InnerClass 之外，其他任何东西都不能访问它");
        }
    }

    /**
     * InnerTest2 类属于 getInnerTest2()的一部分，而不是 InnerClass 的一部分,
     * 因此，InnerTest2 不可从 getInnerTest2() 的外部访问
     * @return
     */
    public InnerInterface getInnerTest2(){
        class InnerTest2 implements InnerInterface{

            @Override
            public void print() {
                System.out.println("");
            }
        }
        /**
         * 在返回语句中发生的上溯造型——InnerInterface 的一个引用之外，
         * 没有任何东西超出getInnerTest2()的边界之外。
         * 当然，不能由于类InnerTest2的名字置于getInnerTest2()内部，
         * 就认为在 getInnerTest2()返回之后 InnerTest2不是一个有效的对象。
         */
        return new InnerTest2();
    }


    public static void main(String[] args) {
        /**
         * 非静态内部类的创建需要依赖于外部类的p实例
         */
        InnerClass p = new InnerClass();

        Contents contents = p.new Contents();

        System.out.println(contents.value());


        /**
         * 内部类 InnerTest 被设为 private，所以除了 InnerClass 之外，其他任何东西都不能访问它
         */
        InnerTest innerTest = p.new InnerTest();
        innerTest.print();
    }

}


