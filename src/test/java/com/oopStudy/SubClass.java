package com.oopStudy;

import net.bytebuddy.implementation.bind.annotation.Super;

public class SubClass extends Superclass {


    public static void main(String args[]) {

        SubClass sub = new SubClass();

        sub.subMethod();
        sub.superMethod();


    }

    public void subMethod() {

        System.out.println(super.num);

        super.superMethod();

    }


}
