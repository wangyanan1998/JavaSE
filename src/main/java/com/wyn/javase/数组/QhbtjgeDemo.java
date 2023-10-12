package com.wyn.javase.数组;

import java.util.Random;

public class QhbtjgeDemo {
    public static void main(String[] args) {
        /*需求:生成10个1~100之间的随机数存入数组。统计有多少个数据比平均值小*/

        int[] arr=new int[10];
        int sum=0;
        int count=0;
        Random rd=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]= rd.nextInt(100)+1;
            sum+=arr[i];
        }
        System.out.println(sum);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<sum/arr.length){
                count++;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println(sum/arr.length);

        System.out.println(count);

    }
}
