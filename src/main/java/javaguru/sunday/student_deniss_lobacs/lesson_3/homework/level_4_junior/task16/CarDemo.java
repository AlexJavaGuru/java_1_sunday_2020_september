package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_4_junior.task16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
