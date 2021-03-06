package javaguru.sunday.student_konstantin_shestakov.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было просто написать while(true)")
class Task16 {

    public static void main(String[] args) {
        int i = 1;

        while (i > 0) {
            System.out.println("while loop");

            for ( ; i > 0; i++) {
                System.out.println("for loop");
                break;
            }
            break;
        }
    }
}
