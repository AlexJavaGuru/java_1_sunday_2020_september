package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task16;

import java.util.Scanner;

class ForInfinityBreak {

    public static void main(String[] args) {

        for (int i = 1; i > 0; i++) {
            System.out.println("Type a number");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
        }
    }

}
