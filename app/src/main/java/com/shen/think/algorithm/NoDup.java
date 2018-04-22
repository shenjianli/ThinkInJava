package com.shen.think.algorithm;

/**
 * Created by shenjianli on 18/4/22.
 */
public class NoDup {

    public static void main(String[] args){
        int dataArray[] = {1,1,2,3,3,5,6,6};
        int count = removeDuplicates(dataArray);
        for (int i = 0 ;i< dataArray.length;i++){
            System.out.print("" + dataArray[i]);
        }
        System.out.println();
        for (int i = 0 ;i< count;i++){
            System.out.print("" + dataArray[i]);
        }
    }

    // 有序数组去重，返回新数组长度
    static int removeDuplicates(int A[]) {
        int i = 0;    // 第一个指针
        int j;        // 第二个指针
        int n = A.length;
        if (n <=1 ) return n;
        // 遍历数组
        for (j = 1; j < n; j++) {
            if (A[j] != A[i]) { // 若两个指针所指元素不同，则i+1位置保存j所指元素的值
                A[++i] = A[j];
            }
        }
        return i+1;    // 返回新数组的长度
    }
}
