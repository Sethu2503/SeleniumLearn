package com.java.study;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import java.util.Scanner;

public class Fibonacci {

    public void Calcfibonacci() {

        Scanner scanner = new Scanner(System.in);
        int Count = scanner.nextInt();


        int a = 0, b = 1, c;
        System.out.println(a + "");
        System.out.println(b + "");

        for (int i = 2; i <= Count; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

}
