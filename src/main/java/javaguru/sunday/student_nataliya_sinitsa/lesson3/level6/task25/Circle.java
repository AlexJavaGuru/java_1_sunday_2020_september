package javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task25;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Circle {

    double radius;

    public void calculateArea () {
        double circleArea = radius * radius * Math.PI;
        System.out.println("Circle area is: " + circleArea);
    }

    Circle (double circleRadius) {
        this.radius = circleRadius;
    }

}
