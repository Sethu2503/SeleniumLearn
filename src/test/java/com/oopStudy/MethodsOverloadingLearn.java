package com.oopStudy;

public class MethodsOverloadingLearn {


    public static void main(String args[]) {

        MethodsOverloadingLearn meth = new MethodsOverloadingLearn();
        int value1 = meth.method1(1, 2);

        System.out.println(value1);

        System.out.println(meth.method2(1, 2, 3));

    }

    int method1(int a, int b) {

        return (a + b);
    }

    long method2(int a, long b, int c) {
        return (a + b + c);


    }


}
