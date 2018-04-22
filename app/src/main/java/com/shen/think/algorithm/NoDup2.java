package com.shen.think.algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by shenjianli on 18/4/22.
 */
public class NoDup2 {

    public static void main(String[] args){
        String [] bb = {"A","B","C","A","C","D","E","!","2","F","G"};
        LinkedHashMap<String,String> result = new LinkedHashMap<>();
        HashMap<String,String> result1 = new HashMap<>();
        for (int i= 0 ;i < bb.length; i++){
            result.put(bb[i],"11");
            result1.put(bb[i],"22");
        }
        Set<String> strings = result.keySet();
        System.out.println(strings);
        System.out.print(result);
        System.out.println();
        System.out.print(result1);
    }
}
