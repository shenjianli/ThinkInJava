package com.shen.think.algorithm;

/**
 * Created by shenjianli on 18/4/25.
 */
public class BubbleSort {

    public static void main(String[] args){

        int[] originalArray = {32,18,41,23,2,56,36,1};
        int temp  = -1;
        for(int i = 0;i<originalArray.length - 1;i++ ){
            for(int j=0;j<originalArray.length -i - 1;j++){
                if(originalArray[j] > originalArray[j+1]){
                    temp = originalArray[j];
                    originalArray[j] = originalArray[j+1];
                    originalArray[j+1] = temp;
                }
            }
            for(int index = 0;index<originalArray.length;index++){
                System.out.print(originalArray[index] + " ");
            }
            System.out.println();
        }
    }
}
