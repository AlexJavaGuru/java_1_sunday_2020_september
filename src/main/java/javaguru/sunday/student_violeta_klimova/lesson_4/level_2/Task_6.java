package main.java.javaguru.sunday.student_violeta_klimova.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int min;
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();

        min = firstNumber;
        if (secondNumber < min) {
            min = secondNumber;
        }
        System.out.println("Minimal number = " + min);
    }
}