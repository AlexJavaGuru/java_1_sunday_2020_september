package javaguru.sunday.student_artjom_proshkin.lesson_3.level_4_junior.task_16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
