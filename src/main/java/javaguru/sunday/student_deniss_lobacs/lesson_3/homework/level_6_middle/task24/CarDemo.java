package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task24;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car("Audi","A4" , 2019);
        car.displayInfo();
        car.taxiCheak();
    }
}
