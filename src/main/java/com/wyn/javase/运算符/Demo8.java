package com.wyn.javase.运算符;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
//        //需求:使用三元运算符，获取两个数的较大值
//        //分析:
//        // 1.定义两个变量记录两个整数
//        int number1 = 10;
//        int number2 = 20;
//        //2.使用三元运算符获取两个整数的较大值
//        // 格式:关系表达式 ? 表达式1 : 表达式2;
//        // 整个三元运算符的结果必须要被使用
//        int max = number1 > number2 ? number1 : number2;
//        System.out.println(max);
//        System.out.println(number1 > number2 ? number1 : number2);


//        /*需求:动物园里有两只老虎，体重分别为通过键盘录入获得，请用程序实现判断两只老虎的体重是否相同。*/
//        //分析:
//        //1.键盘录入两只老虎的体重
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一只老虎的体重");
//        int weight1 = sc.nextInt();
//        System.out.println("请输入第二只老虎的体重");
//        int weight2 = sc.nextInt();
//        //2.比较
//        //true false
//        //相同 不同
//        //System.out.println(weight1 == weight2);
//
//        String result = weight1 == weight2 ? "相同" : "不同";
//        System.out.println(result);


        /*需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm,
         请用程序实现获取这三个和尚的最高身高。*/
        //1.定义三个变量记录三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2.拿着第一个和尚和第二个和尚进行比较//再拿着结果跟第三个和尚进行比较即可
        int temp = height1 > height2 ? height1 : height2;
        int maxa = temp > height3 ? temp : height3;
        //ctrl + alt + L 自动的格式化代码
        System.out.println(maxa);
    }
}
