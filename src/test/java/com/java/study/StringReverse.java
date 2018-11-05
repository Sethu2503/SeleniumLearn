package com.java.study;

import java.util.Scanner;

public class StringReverse {

    Scanner scanner = new Scanner(System.in);
    String StrValue = scanner.nextLine();

    public void StrReverseMethod1() {
        char[] StrValue2 = StrValue.toCharArray();

        int Length = StrValue2.length;

        for (int i = Length - 1; i >= 0; i--) {
            System.out.print(StrValue2[i]);
        }
    }

    public void StrReverseMethod2() {
        StringBuilder StrValue3 = new StringBuilder();

        StrValue3.append(StrValue);

        StrValue3 = StrValue3.reverse();

        System.out.println(" " + StrValue3);
    }

}