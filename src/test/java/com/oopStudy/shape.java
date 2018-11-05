package com.oopStudy;

public interface shape {

    int a = 10;

    int b = 5;

    void draw();

}

class Rectangle implements shape {

    public void draw() {

        System.out.println("Drawing Rectangle");
    }
}

class Circle implements shape {

    public void draw() {

        System.out.println("Drawing Circle");
    }
}

class mainclass {

    public static void main(String args[]) {

        shape circle = new Circle();

        shape Rectangle = new Rectangle();

        circle.draw();

        System.out.println(circle.a);

        Rectangle.draw();

        System.out.println(Rectangle.b);

    }


}



