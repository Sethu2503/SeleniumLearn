package com.oopStudy;

import com.java.study.*;

class poly1 {

    public void newexample() {
        System.out.println("NewEx1");
    }

}

class poly2 extends poly1 {

    public void newexample() {
        System.out.println("NewEx2");
    }

}

class RunPoly extends poly2 {
    public static void main(String args[]) {

        poly1 a = new poly2();
        a.newexample();

        com.java.study.ArmstrongNumber a1 = new ArmstrongNumber();// fully qualified name


    }

}