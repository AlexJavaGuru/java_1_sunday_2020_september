package javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class AverageOfNumbers {
    public static void main(String[] args) {
        int[] arrayOfRandomNumbers = new int[3];
        double sumOfNumbers = 0;
        Random random = new Random();

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(10);
            System.out.println(arrayOfRandomNumbers[i]);
            sumOfNumbers += arrayOfRandomNumbers[i];
        }
        System.out.println("Summ of numbers is: " + sumOfNumbers);
        System.out.println("Average of numbers is " + sumOfNumbers/ arrayOfRandomNumbers.length);
    }
}
