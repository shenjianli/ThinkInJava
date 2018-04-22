package com.shen.think.access;

import com.shen.think.access.modifier.Person;

/**
 * Created by shenjianli on 17/12/6.
 */
public class Computer {

    public void work() {
        /**
         * /**
         * 不同包下的非继承类只可使用public声明的变量
         */
        Person person = new Person();
        person.name = "abc";

        /**
         * 3.不同包下非继承类，不可访问protected default private的变量
         */
        //person.age = 20;
        //person.sex = "Male";
        //person.job = "teacher";

        Student student = new Student();
        student.name = "fgh";
        /**
         * 尽管Student是Person的子类，age 声明为protected,但protected指的是只能在Student中使用
         * 下面的student.age为在Computer中使用
         */
        //student.age = 22;

    }
}
