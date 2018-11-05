package com.java.study;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class PrimeNumber {

    public void calcPrime() {

        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int flag = 0, rem;

        rem = num / 2;

        if (num == 0 || num == 1) {
            System.out.print("Its not a Prime Number");
        } else {

            for (int i = 2; i <= rem; i++) {
                if (num % i == 0) {
                    System.out.println("Its not an prime number");
                    flag = 1;
                    break;


                }

            }

            if (flag == 0) {
                System.out.println("Its an prime number");
            }


        }


    }


}
