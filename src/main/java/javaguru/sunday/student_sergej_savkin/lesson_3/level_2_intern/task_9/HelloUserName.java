package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_2_intern.task_9;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
