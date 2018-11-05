package com.java.study;

import java.util.Scanner;

public class ArmstrongNumber {

    public void calcArm() {

        System.out.println("Enter a Number");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        int a, n, c = 0, temp;
        temp = i;

        while (i > 0) {
            a = i % 10;
            i = i / 10;
            c = c + (a * a * a);
        }

        if (temp == c) {
            System.out.println("Its an Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }


    }

}
