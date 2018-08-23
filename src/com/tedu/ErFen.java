package com.tedu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 二分查找、
 * luckzha
 */
public class ErFen {
    public static void main(String[] args) {
        int[] a = suiji();
        System.out.println("请输入t");
        int t = (new Scanner(System.in)).nextInt();
        int index = sort(a, t);
        if (index >= 0) {
            System.out.println("在位置" + index);
        } else {
            System.out.println("找不到位置" + t);
        }

    }

    private static int[] suiji() {
        System.out.println("输入shuzjfs ：");
        int s = (new Scanner(System.in)).nextInt();
        int[] a = new int[s];

        for(int i = 0; i < a.length; ++i) {
            a[i] = (new Random()).nextInt(s);
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static int sort(int[] a, int t) {
        int min = 0;
        int max = a.length - 1;

        while(max > min) {
            int mid = (min + max) / 2;
            if (a[mid] > t) {
                max = mid;
            } else {
                if (a[mid] >= t) {
                    return mid;
                }

                min = mid + 1;
            }
        }

        return -1;
    }

}
