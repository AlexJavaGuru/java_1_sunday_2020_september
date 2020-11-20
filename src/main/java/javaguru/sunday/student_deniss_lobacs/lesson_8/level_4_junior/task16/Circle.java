package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task16;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(String title , double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

}