package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_1;

//Task_4
import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }
    }
}