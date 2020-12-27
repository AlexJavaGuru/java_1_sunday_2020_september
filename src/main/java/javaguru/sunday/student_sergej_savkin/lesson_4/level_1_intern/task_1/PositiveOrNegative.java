package javaguru.sunday.student_sergej_savkin.lesson_4.level_1_intern.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class PositiveOrNegative {
    public static void main(String[] args) {
        int number;

        System.out.println("Please enter your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number > 0){
            System.out.println("Your number is positive");
        } else if (number < 0){
            System.out.println("Your number is negative");
        } else {
            System.out.println("Wrong number!");
        }

    }
}
