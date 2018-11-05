package com.java.study;

public class StringLearn {

    public static void main(String[] args) {

        String s = "Sethu";
        String s1 = " Sethu ";

        String s2 = new String("Sethu");


        boolean s3 = s1.equals(s2);


        s1 = s1.trim();

        System.out.println(s1);

        System.out.println(s3);


    }


}
