package javaguru.sunday.student_kristina_sutugina.lesson_9.level_1.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.getMoney(555,10);
        safe.getMoney(1234,10);
        safe.putMoney(333, 10);
        safe.putMoney(1234, 10);
    }
}
