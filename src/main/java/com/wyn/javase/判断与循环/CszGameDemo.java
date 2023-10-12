package com.wyn.javase.判断与循环;

import java.util.Random;
import java.util.Scanner;

public class CszGameDemo {
    public static void main(String[] args) {
        /**
         * 需求:程序自动生成一个
         * 1-100
         * 之间的随机数字
         * 使用程序实现猜出这个数字是多少?
         */
        Random random = new Random();
        int number = random.nextInt(100) + 1;//1~100
        Scanner sc = new Scanner(System.in);

        int count =1;

        while (true){
            System.out.println("输入猜的数字");
            int guessNumber = sc.nextInt();

            if (guessNumber<number){
                System.out.println("小了");
            }else  if (guessNumber>number){
                System.out.println("大了");
            }else  if (guessNumber==number){
                System.out.println("中了");
                break;
            }
            System.out.println("猜了"+count);
            count++;
        }



    }
}
