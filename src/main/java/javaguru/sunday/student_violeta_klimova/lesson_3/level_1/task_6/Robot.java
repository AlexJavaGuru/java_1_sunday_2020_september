package javaguru.sunday.student_violeta_klimova.lesson_3.level_1.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Но он же ничего не делает на вызов этих методов?")
public class Robot {
    public void sayHello (){
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is ROBO");
    }
}