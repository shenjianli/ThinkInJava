package com.shen.think.exception;

/**
 * Created by ljq on 2017/12/15.
 */

public class InheritingExceptions {

    /**
     * 调用这个方法会抛出异常----以后写lib库可以使用这个方法
     * @param id
     * @throws SimpleException
     */
    public void f(int id) throws SimpleException{
        System.out.println("Throw SimpleException from f()" + id);
        if(1 == id){
            throw new SimpleException();
        }
    }

    public static void main(String[] args){
        InheritingExceptions inheritingExceptions = new InheritingExceptions();

        try {
            inheritingExceptions.f(0);
        } catch (SimpleException e) {
            System.out.println("0 catch id !");
        }

        try {
            inheritingExceptions.f(1);
        } catch (SimpleException e) {
            System.out.println("1 catch id !");
            // err是运行期异常和错误反馈的输出流的方向
            // System.err.println只能在屏幕上实现打印，即使你重定向了也一样
            // 标准输出往往是带缓存的，而标准出错没有缓存
            System.err.println("err 1 catch id !");
        }
    }
}
