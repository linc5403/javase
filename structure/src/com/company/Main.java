package com.company;

import java.util.Arrays;

public class Main {

    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

    static String add(char a, char b) {
        return "" + a + b;
    }

    static String add(String a, String b) {
        return "" + a + b;
    }


     static int getArrayLen(int[] arr, int b) {
         arr[0] = 10;
         arr[1] = 20;
         System.out.println("inner " + (++b));
         return arr.length;
    }

    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i < 10; i++) {
            System.out.print(" " + i);
        }
//        System.out.println(i);

        {
            int a = 100;
            System.out.println("a = " + 100);
        }

        int[] a = new int[2];

        {
//            int a = 100;
        }

        int b = 100;

        int len = getArrayLen(a, b);
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println(b);

        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}
