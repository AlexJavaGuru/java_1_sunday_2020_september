package javaguru.sunday.student_artjoms_bocarovs.lesson_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Для этой цели, лучше бы подошел switch")
public class Task_3 {

    public static void main(String[] args) {

        System.out.println("Enter number from 1 to 7 : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("It is Monday!");
        } else if (input == 2) {
            System.out.println("It is Tuesday!");
        } else if (input == 3) {
            System.out.println("It is Wednesday!");
        } else if (input == 4) {
            System.out.println("It is Thursday!");
        } else if (input == 5) {
            System.out.println("It is Friday!");
        } else if (input == 6) {
            System.out.println("It is Saturday!");
        } else if (input == 7) {
            System.out.println("It is Sunday!");
        }
    }
}
