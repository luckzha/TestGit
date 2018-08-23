package com.tedu;

import java.util.Scanner;

public class JieCheng {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        int n = (new Scanner(System.in)).nextInt();
        int a = f(n);
        System.out.println(a);
    }

    private static int f(int n) {
        if (n == 1) {
            System.out.println("n-1:" + n);
            return n;
        } else {
            return n * f(n - 1);
        }
    }

}
