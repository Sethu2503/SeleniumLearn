package com.java.study;

public class DuplicateCharString {


    public static void main(String args[]) {

        String S1 = "Alphabet";

        char arr[] = S1.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 7; j >= i; j--) {
                if (arr[i] == arr[j]) {

                    System.out.println(arr[j]);
                }
            }
        }


    }
}
