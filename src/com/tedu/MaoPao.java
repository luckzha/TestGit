package com.tedu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaoPao {
    public MaoPao() {
    }

    public static void main(String[] args) {
        System.out.println("请输入数");
        int s = (new Scanner(System.in)).nextInt();
        int[] arr = new int[s];

        for(int i = 0; i < s; ++i) {
            arr[i] = (new Random()).nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = 0; j < arr.length - 1 - i && arr[j] > arr[j + 1]; ++j) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        return arr;
    }
}
