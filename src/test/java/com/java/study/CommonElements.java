package com.java.study;

public class CommonElements {


    public static void main(String Args[]) {

        int[] arr1 = {4, 8, 9, 3, 5};
        int[] arr2 = {8, 0, 3, 7, 5};

        int arr1len = arr1.length;
        int arr2len = arr2.length;

        for (int i = 0; i < arr1len; i++) {
            for (int j = 0; j < arr2len; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }


    }
}
