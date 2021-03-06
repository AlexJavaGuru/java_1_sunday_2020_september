package javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_27;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayMaxNumberOut {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Max number in array is " + max);
    }
}
