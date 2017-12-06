package com.shen.think.access;

import com.shen.think.access.modifier.Person;

/**
 * Created by shenjianli on 17/12/6.
 */
public class Student extends Person {

    public void print(){
        /**
         * 不同包下的继承类可以使用，用public protected声明变量
         */
        name = "小申";
        age  = 28;

        /**
         * 2.编译不通过，因为Person中的sex为default修饰，只能在同包下使用
         */
        //sex = "男";
        super.print();
    }

    public void study(){
        Person person = new Person();
        person.name = "ABC";
        /**
         * 这个方式不可使用，不属于继承范围
         * 因此不可调用protected声明的变量
         */
        //person.age = 18;
    }
}
