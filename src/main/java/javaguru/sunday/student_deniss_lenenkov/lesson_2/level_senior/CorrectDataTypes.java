package javaguru.sunday.student_deniss_lenenkov.lesson_2.level_senior;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 =" + numberOne);
        System.out.println("Number 2 =" + numberTwo);

        double sum = numberOne + numberTwo;
        System.out.println("Sum =" + sum);
    }
}
