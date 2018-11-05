package com.java.study;

import java.util.Scanner;

public class MobileNumber {


    public static boolean NumCheck(String Number) {
        try {

            Long.parseLong(Number);

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {


        System.out.println("Enter the Mobile Number :");
        Scanner scanner = new Scanner(System.in);
        String Number = scanner.next();

        if ((NumCheck(Number)) && (Number.length() == 10)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
