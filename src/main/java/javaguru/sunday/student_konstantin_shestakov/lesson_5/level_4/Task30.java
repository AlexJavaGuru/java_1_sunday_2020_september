package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class Task30 {

    public static void main(String[] args) {
        Random random = new Random();

        int ArrayRandomLength = random.nextInt(10) + 1;
        int[] arrayOne = new int[ArrayRandomLength];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(arrayOne));

        int oddNumber;
        System.out.println("Нечётные числа массива: ");

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                oddNumber = arrayOne[i];
                System.out.println(oddNumber);
            }
        }

    }
}
