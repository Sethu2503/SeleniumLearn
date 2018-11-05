package com.oopStudy;

import java.lang.String.*;

public class ConstructorLearn {

    String Name;

    public ConstructorLearn() {

        System.out.println("Im default Constructor");

    }


    public ConstructorLearn(String Name) {

        this.Name = Name;
        System.out.println(Name);
        calculate();
        System.out.println("Im Parameterized Constructor");
    }

    public void calculate() {
        System.out.println("new Method");
    }


}
