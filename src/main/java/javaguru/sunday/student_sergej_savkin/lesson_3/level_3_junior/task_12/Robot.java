package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_3_junior.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Очень сложно читать ваш класс. У вас совсем уехал формат. Надо исправить")
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

