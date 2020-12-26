package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int[] a = new int[n];
    int sum = 0;
    for(int i = 0; i < n;i++){
        a[i] = in.nextInt();
        if(a[i] % k == 0) sum += a[i];
    }
    System.out.println("Сумма элементов массива кратных " + k +" равна " + sum);
    }
}
