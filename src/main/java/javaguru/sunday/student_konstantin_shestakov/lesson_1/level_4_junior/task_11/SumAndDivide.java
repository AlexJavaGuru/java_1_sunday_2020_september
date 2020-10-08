package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_1.level_4_junior.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Лучыше не использовать такие названия для классов. Создайте отдельные Package для каждого урока и для каждого уровня воответственно." +
        "В названии переменных нельзя использовать _, цифры в том числе.")
// 06.10.20 - Исправлено

public class SumAndDivide {

    public static void main(String[] args) {
        // Sum
        byte numberOne = 74;
        byte numberTwo = 36;
        System.out.println("Test Data: ");
        System.out.println(numberOne + " + " + numberTwo);
        System.out.println("Output: ");
        System.out.println(numberOne + numberTwo);

        System.out.println("-----------------------------------------------------------------");

       // Divide
        byte numberThree = 50;
        byte numberFour = 3;
        System.out.println("Test Data: ");
        System.out.println(numberThree + " / " + numberFour);
        System.out.println("Output: ");
        System.out.print(numberThree / numberFour);
    }
}