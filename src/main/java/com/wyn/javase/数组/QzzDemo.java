package com.wyn.javase.数组;

public class QzzDemo {
    public static void main(String[] args) {
        int[] arr1 = {33, 5, 22, 44, 55};

        int max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            max = Math.max(max, arr1[i]);
        }

        System.out.println(max);
    }
}
