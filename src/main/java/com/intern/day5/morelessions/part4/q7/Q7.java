package com.intern.day5.morelessions.part4.q7;

import com.intern.day5.morelessions.part4.q7.Shape;

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double area() {
        return length * width;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
