package com.wyn.javase.判断与循环;

public class F7gDemo {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏:逢7过游戏规则:从任意一个数字开始报数，
        当你要报的数字是包含7或者是7的倍数时都要说过:过
        需求: 使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/

        int start = 2;
        int end = 100;

        while (start <= end) {
            if (start % 7 == 0 || start % 10 == 7 || start / 10 % 10 == 7) {
                System.out.println("过");
                start++;
            }else {
                System.out.println(start);
                start++;
            }

        }
    }
}
