package javaguru.sunday.student_natalia_kochkina.lesson_2.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtaction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(sum + "; " + subtaction + "; " + multiplication + "; " + division);
    }
}
