package javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;


@CodeReview(approved = true)
class PowerCalculator {

    public double powerCalculator(double number, double degree) {
        if (degree == 0) {
            return 1;
        } else if(number == 0){
            return 0;
        } else if (degree < 0) {
            double result = 1;
            for (double i = 0; i < degree * -1; i++) {
                result = result * number;
            }
            return 1 / result;
        } else {
            double result = 1;
            for (double i = 0; i < degree; i++) {
                result = result * number;
            }
            return result;
        }
    }
}

