package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_1.task_1_2;

//Task_1
//Task_2

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("положительное число");
        } else if (number < 0) {
            System.out.println("отрицательное число");
        } else {
            System.out.println("ноль");
        }

    }
}