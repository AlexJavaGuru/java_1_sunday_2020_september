package javaguru.sunday.student_artjoms_bocarovs.lesson_8;

import java.awt.*;

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
