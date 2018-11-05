package com.java.study;

public class Recursion {

    public static void main(String args[]) {
        String str = "Sethu";

        if ((null == str) || (str.length() <= 1)) {
            System.out.println(str);
        } else {
            for (int i = 0; i < str.length() - 1; i++)
                System.out.println(str.charAt(str.length() - 1));
            str.substring(0, str.length() - 1);

        }
    }


}
