package javaguru.sunday.student_anna_aleksejeva.lesson_9.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StrongBoxDemo {
    public static void main(String[] args){
        StrongBox myStrongBox = new StrongBox(0000, 100);
        myStrongBox.pinCode = 1256;
        myStrongBox.moneyAmount = 123;
    }

}
