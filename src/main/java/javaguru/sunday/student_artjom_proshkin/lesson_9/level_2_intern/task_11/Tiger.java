package javaguru.sunday.student_artjom_proshkin.lesson_9.level_2_intern.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Tiger extends Animal {

    int amountLeft;

    public Tiger(String name, int amountLeft) {
        super("Siberian Tiger");
        this.amountLeft = amountLeft;
    }
}
