package com.wyn.javase.运算符;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("---------------");
        Scanner scanner1=new Scanner(System.in);
        int b = scanner1.nextInt();
        if (a > b){
            System.out.println("成功");
        }

    }
}
