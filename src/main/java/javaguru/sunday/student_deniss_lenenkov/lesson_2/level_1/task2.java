package javaguru.sunday.student_deniss_lenenkov.lesson_2.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("First number is" + firstDoubleNumber);

        System.out.println("enter second number:");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Second number is" + secondDoubleNumber);

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);

    }
}
