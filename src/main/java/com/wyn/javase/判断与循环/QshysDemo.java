package com.wyn.javase.判断与循环;

public class QshysDemo {
    public static void main(String[] args) {
        /*需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)将两数相除，要求不使用乘法、除法和 % 运算符得到商和余数*/

        int bcs=92;
        int cs=5;
        int x=0;

        while (bcs>=cs){
            bcs=bcs-cs;
            x++;
        }
        System.out.println(bcs);
        System.out.println(x);
    }
}
