package javaguru.sunday.student_liana_shirmane.lesson_9.level_3;
//task16

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}