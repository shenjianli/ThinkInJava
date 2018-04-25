package com.shen.think.algorithm;

/**
 * Created by shenjianli on 18/4/25.
 */
public class BinarySearch {

    public static void main(String[] args){
        int data[] = {12,16,19,22,25,32,39,48,55,57,58,63,68,69,70,78,84,88,90,97};
        binarySearch(data, 69);

    }
    private static void binarySearch(int data[],int key){
        int left;
        int right;
        int middle;
        left = 0;
        right = data.length - 1;

        while(left <= right){
            middle = (left + right)/2;
            if(key < data[middle]){
                right = middle -1;
            }
            else if(key > data[middle]){
                left = middle + 1;
            }
            if(key == data[middle]){
                System.out.println("Find in index:" + middle);
                return;
            }
        }
    }
}
