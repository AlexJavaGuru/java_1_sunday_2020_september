package javaguru.sunday.student_deniss_lobacs.lesson_2.homework.level_2_intern.task8;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не хватает пробелов около знака =. Лучше пишите полное название scanner. Нам не жалко букв на названия переменных =) ")
public class HelloUser {

    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name=scn.nextLine();

        System.out.println("Hello," +name);
    }
}
