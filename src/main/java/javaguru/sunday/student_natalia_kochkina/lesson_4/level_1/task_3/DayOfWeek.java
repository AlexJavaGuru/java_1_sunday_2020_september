package javaguru.sunday.student_natalia_kochkina.lesson_4.level_1.task_3;

//Task_3

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDay = scanner.nextInt();

        switch (numberOfDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Uncnown input");


        }
    }
}
