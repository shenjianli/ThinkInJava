package com.shen.think.access.modifier;

/**
 * Created by shenjianli on 17/12/6.
 */
public class People {

    public void print() {
        Person person = new Person();
        /**
         * 同一包下的用public protected default 可以访问
         */
        person.age = 10;
        person.name = "shenjianli";
        person.sex = "Male";
        /**
         * 1.编译不通过，因为Person中的job为private修饰，只能在Person中使用
         */
        //person.job = "Android 开发";
        person.print();
    }
}
