package javaguru.sunday.student_sergej_savkin.lesson_3.level_4_junior.task_15;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Phone {

    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}