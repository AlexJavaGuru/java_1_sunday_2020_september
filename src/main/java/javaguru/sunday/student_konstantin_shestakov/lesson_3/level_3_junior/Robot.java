package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 11
// Task 12
// Task 13
@CodeReview(approved = true)
class Robot {

    String name; // Task 11

    Robot(String robotName){
        this.name = robotName; // Task 12
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName(){ // Task 13
        System.out.println("My name is " + name);
    }


}
