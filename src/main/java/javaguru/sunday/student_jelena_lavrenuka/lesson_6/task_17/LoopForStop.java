package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LoopForStop {


    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
