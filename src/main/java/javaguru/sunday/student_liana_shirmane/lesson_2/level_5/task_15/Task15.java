package javaguru.sunday.student_liana_shirmane.lesson_2.level_5.task_15;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task15 {
    public static void main(String[] args) {
        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Please, enter your surname:");
        String userSurname = scanner.nextLine();
        System.out.print(userName + " ");
        System.out.print(userSurname);
    }
}
