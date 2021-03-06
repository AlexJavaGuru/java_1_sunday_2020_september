package javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_18
@CodeReview(approved = true)
public class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumOfAllNumbersTest();

    }

    public void sumOfAllNumbersTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int sum = twoDimensionalArray.sumOfAllNumbers(array);
        int expectedSum = 18;
        if (sum == expectedSum) {
            System.out.println("SumTest OK");
        } else {
            System.out.println("SumTest failed");
        }
    }
}
