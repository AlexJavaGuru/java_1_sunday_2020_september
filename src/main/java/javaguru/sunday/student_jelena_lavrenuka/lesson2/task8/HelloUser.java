package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson2.task8;

import java.util.Scanner;

public class HelloUser {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Please enter your Login: ");

        String Login = scanner.nextLine();

        System.out.println("Hello " + Login);

    }
}