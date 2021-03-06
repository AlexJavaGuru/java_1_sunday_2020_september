package javaguru.sunday.student_sergej_savkin.lesson_3.level_3_junior.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Robot {

    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    Robot(String robotName) {
        this.name = robotName;
    }
    void sayYourName(){
        System.out.println("My name is " + name);
    }
}

