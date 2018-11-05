package com.java.study;

import java.util.Scanner;

public class Factorial {

    public void calcFact() {

        int fact = 1;

        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.print("The factorial of the number " + number);
        System.out.print(" is " + fact);
    }


}
