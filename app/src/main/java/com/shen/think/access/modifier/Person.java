package com.shen.think.access.modifier;

/**
 * Created by shenjianli on 17/12/6.
 */
public class Person {

    public String name = "Jerry Shen";

    protected int age = 30;

    String sex = "男";

    private String job = "Android 码农";

    public void  print(){

        System.out.print(name + ":" + age + ":" + sex + ":" + job );
    }

}
