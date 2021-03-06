package javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
