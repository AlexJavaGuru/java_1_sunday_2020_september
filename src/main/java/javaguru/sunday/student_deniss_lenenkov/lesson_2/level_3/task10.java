package javaguru.sunday.student_deniss_lenenkov.lesson_2.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle radius:");
        double radius = scanner.nextDouble();
        byte x = 2;

        double pirimetr = x * Math.PI * radius;
        System.out.println("pirimetr =" + pirimetr);

        double area = Math.PI * Math.pow(radius, x);
        System.out.println("area =" + area);






    }
}
