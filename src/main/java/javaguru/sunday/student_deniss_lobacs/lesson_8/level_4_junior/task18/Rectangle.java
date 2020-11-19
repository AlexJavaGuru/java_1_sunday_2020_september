package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task18;

import static java.lang.Math.sqrt;

public class Rectangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Rectangle(String title , double sideOne , double sideTwo , double sideThree) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    double calculateArea() {
        double semiPerimeter = (calculatePerimeter()/2);
        return sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
    }

    @Override
    double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}