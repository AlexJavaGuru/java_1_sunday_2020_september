package javaguru.sunday.student_natalia_kochkina.lesson_2.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 numbers:");

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        double middleNumber = (double) sum / 3;
        System.out.println(middleNumber);


    }
}
