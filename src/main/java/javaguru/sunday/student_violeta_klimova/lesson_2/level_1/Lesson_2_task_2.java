package javaguru.sunday.student_violeta_klimova.lesson_2.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Lesson_2_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("First number is "+ firstDoubleNumber);

        System.out.println("Enter your second number:");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Second number is "+ secondDoubleNumber);

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
    }
}

