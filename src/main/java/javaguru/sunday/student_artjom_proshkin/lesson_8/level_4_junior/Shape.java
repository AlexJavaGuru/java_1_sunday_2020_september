package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

// Task_15

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
