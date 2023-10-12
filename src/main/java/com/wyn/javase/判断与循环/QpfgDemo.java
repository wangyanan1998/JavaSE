package com.wyn.javase.判断与循环;

import java.util.Scanner;

public class QpfgDemo {
    public static void main(String[] args) {
        /**
         * 需求:键盘录入一个大于等于2的整数X，
         * 计算并返回的平方根结果只保留整数部分，小数部分将被舍去
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i + 1) * (i + 1) > number && i * i <= number) {
                System.out.println(i);
            }
        }
    }
}
