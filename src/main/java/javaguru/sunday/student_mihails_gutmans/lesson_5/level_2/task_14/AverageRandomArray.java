package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_2.task_14;

import java.util.Random;

public class AverageRandomArray {
    public static void main(String[] args) {
        int[] myRandomArray = new int[3];

        int sum=0;
        for (int i = 0 ; i< myRandomArray.length ; i++ ){
            Random randomNumber = new Random();
            myRandomArray [i] =randomNumber.nextInt(100);
            System.out.println(myRandomArray[i]); // vivel na konsolj , chto bi bilo vidno
            sum = sum + myRandomArray[i];
        }
        System.out.println(sum / myRandomArray.length );
    }
}