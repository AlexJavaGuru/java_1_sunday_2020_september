package javaguru.sunday.student_deniss_lobacs.lesson_9.level_2_intern.task11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {
    String mark;
    int year;

    protected Car(String mark, int year) {
        this.mark = mark;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car = new Car("Audi" , 2020);
    }
}
