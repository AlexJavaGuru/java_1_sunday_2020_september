package javaguru.sunday.student_violeta_klimova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfNumbers = new int[10];


        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        for (int oddNumbers : arrayOfNumbers) {
            if (oddNumbers % 2 != 0) {
                System.out.println(oddNumbers);
            }
        }
    }
}