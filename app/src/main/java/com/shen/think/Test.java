package com.shen.think;

/**
 * Created by shenjianli on 18/4/21.
 */
public class Test {

    public static void main(String[] args){
        short s1 = 1;
        /**
         *  int 赋予给 short 类型的变量 s1 会出现类型转换错误（无法编译，IDE 提示错误）
         */
        //s1 = s1 + 1;
        /**
         * += 是 java 语法规定的运算符，所以 java 编译器会对它进行转换特殊处理
         */
        s1 += 1;
        switch ("1"){
            case "1":
                System.out.print("String");
                break;
        }
    }
}
