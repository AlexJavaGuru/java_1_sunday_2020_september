package main.java.javaguru.sunday.student_natalia_kochkina.lesson_5.level_4;

//Task_30

import java.util.Random;

public class NewRandomArray5 {

    public static void main(String[] args) {
        int[] newArray = new int[5];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
            System.out.println(newArray[i]);
        }

        System.out.println("Odd numbers: ");

        for (int i = 0; i < newArray.length; i++) {
            if ((newArray[i] % 2) != 0) {
                System.out.println(newArray[i]);
            }
        }
    }
}
