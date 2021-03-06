package javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_10
@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testPowerCalculator();
    }

    public void testPowerCalculator(){
        int number = 3;
        int power= 4;
        int actualResult = 81;
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = powerCalculator.powerCalculator(number, power);
        check(expectedResult,actualResult, "testPowerCalculator");
    }

    public void check(int expectedResult, int actualResult, String tesName) {
        if (expectedResult == actualResult) {
            System.out.println(tesName +" test passed.");
        } else {
            System.out.println(tesName + " test failed.");
        }
    }
}
