package javaguru.sunday.student_glebs_surtajevs.lesson_3.level_2;

//Task_7
//Task_8
//Task_9

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Gleb {
    public static void main(String[] args) {
        String myName = "Gleb";
        System.out.println(myName);

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        System.out.println("Please enter userName");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");

    }
}
