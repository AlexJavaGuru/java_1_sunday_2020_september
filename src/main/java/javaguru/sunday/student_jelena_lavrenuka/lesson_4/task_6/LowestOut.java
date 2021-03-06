package javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class LowestOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integer numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else if (numberOne < numberTwo) {
            System.out.println("Lowest number " + numberOne);
        } else {
            System.out.println("Lowest number " + numberTwo);
        }
    }
}

