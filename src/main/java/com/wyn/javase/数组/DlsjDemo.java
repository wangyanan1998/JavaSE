package com.wyn.javase.数组;

import java.util.Random;

public class DlsjDemo {
    public static void main(String[] args) {
        /**
         * 需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
         */

        int[] arr = {1, 2, 3, 4, 5};

        Random rd=new Random();
        for (int i = 0; i < arr.length; i++) {
            int random = rd.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[random];
            arr[random]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
