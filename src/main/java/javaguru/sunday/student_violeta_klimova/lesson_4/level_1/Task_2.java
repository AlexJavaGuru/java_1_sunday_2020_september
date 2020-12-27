package javaguru.sunday.student_violeta_klimova.lesson_4.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Your number is zero");
        } else if(number <= -1) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is positive");
        }
    }
}