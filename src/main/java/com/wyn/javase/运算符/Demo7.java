package com.wyn.javase.运算符;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都为真，结果才是真
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        //2.| 或者
        // 两边都为假，结果才是假
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        // ^异或
        //相同为false，不同为true
        //了解一下即可
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true

        //! 逻辑非 取反
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);//true
        System.out.println(!true);//false

        //1.&&
        //运行结果跟单个&是一样的
        //表示两边都为真，结果才是真
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        System.out.println(true && false);//false


        //2.||
        //运行结果跟单个|是一样的
        //表示两边都为假，结果才是假
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true


        //3.短路逻辑运算符具有短路效果
        // 简单理解:当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10


        Scanner scanner=new Scanner(System.in);
        int c = scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        int d = scanner1.nextInt();
        if (c==6||d==6){
            System.out.println(true);
        }else if ((c+d)%6==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
