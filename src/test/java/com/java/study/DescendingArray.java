package com.java.study;

public class DescendingArray {

    public static void ArrayDescend(int arr[]) {
        int temp = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String args[]) {

        int arr[] = {60, 5, 56, 8, 4, 90};

        for (int i : arr) {
            System.out.println("Array before sorting , " + i);

        }

        ArrayDescend(arr);

        for (int i : arr) {
            System.out.println("Array after Sorting," + i);
        }


    }


}
