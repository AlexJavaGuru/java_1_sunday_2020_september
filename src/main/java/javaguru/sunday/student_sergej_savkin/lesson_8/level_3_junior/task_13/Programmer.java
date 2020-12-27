package javaguru.sunday.student_sergej_savkin.lesson_8.level_3_junior.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Programmer extends Employee {

    Programmer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Writing a code!");
    }
}
