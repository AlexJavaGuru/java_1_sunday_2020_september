package javaguru.sunday.student_mihails_gutmans.lesson_5.level_2.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class MyArray {

    public static void main(String[] args) {

        int[] threeNumbers = {5,3,1};
        System.out.println(threeNumbers[0]);
        System.out.println(threeNumbers[1]);
        System.out.println(threeNumbers[2]);
        System.out.println(Arrays.toString(threeNumbers));
    }
}
