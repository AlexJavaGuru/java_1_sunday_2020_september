package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_2_intern.task_9;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");

    }
}