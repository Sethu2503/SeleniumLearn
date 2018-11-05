package com.java.study;

import java.util.Scanner;

public class Palindrome {


    public void palincalc() {

        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int div = scanner.nextInt();

        int Rem, Sum = 0, temp;

        temp = div;


        while (div > 0) {

            Rem = div % 10;
            Sum = (Sum * 10) + Rem;
            div = div / 10;

        }


        if (temp == Sum) {
            System.out.println("The Number is a Palindrome" + Sum);
        } else {
            System.out.println("The number is not an palindrome" + Sum);
        }

    }

}
