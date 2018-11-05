package com.java.study;

public class TransposeMatrix {

    public void Transpose() {


        int original[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrix before Transpose");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + "");
            }

            System.out.println();
        }
        System.out.println("Matrix After Transpose");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[j][i] + "");
            }

            System.out.println();
        }


    }


}
