package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_2;

import java.util.Scanner;
//Task_7

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int number = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();

        if (number == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
