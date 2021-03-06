package javaguru.sunday.student_natalia_kochkina.lesson_4.level_3.task_8;

//Task_8

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class ThreeDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("The third number: ");
        int numberThree = scanner.nextInt();

        if ((numberOne == numberTwo) && (numberOne == numberThree)) {
            System.out.println("Numbers are equal");
        } else if ((numberOne != numberTwo) && (numberOne != numberThree)) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
