package com.wyn.javase.判断与循环;

import java.util.Scanner;

public class QzsDemo {
    public static void main(String[] args) {
        /**
         * 需求:键盘录入一个正整数x，判断该整数是否为一个质数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int number = sc.nextInt();

        int x = 2;

        while (x < number) {

            if (number % x == 0 ) {
                System.out.println(number + "这个数不是质数");
                break;
            }else {
                System.out.println(number + "这个数是质数");
            }
            x++;
        }
    }
}
