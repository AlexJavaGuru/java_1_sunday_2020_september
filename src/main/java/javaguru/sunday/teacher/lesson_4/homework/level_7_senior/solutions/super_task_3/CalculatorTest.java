package javaguru.sunday.teacher.lesson_4.homework.level_7_senior.solutions.super_task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		calculatorTest.sumTest();
		calculatorTest.subTest();
		calculatorTest.mulTest();
		calculatorTest.divTest();
		calculatorTest.isEvenTest(40);
	}

	public void sumTest() {
		int firstNumber = 35;
		int secondNumber = 40;
		int result = calculator.sum(firstNumber, secondNumber);
		checkResults(result == 75, "Sum test");
	}

	public void subTest() {
		int firstNumber = 35;
		int secondNumber = 15;
		int result = calculator.sub(firstNumber, secondNumber);
		checkResults(result == 20, "Sub test");
	}

	public void mulTest() {
		int firstNumber = 5;
		int secondNumber = 5;
		int result = calculator.mul(firstNumber, secondNumber);
		checkResults(result == 25, "Mul test");
	}

	public void divTest() {
		int firstNumber = 40;
		int secondNumber = 8;
		int result = calculator.div(firstNumber, secondNumber);
		checkResults(result == 5, "Div test");
	}

	public void isEvenTest(int testValue) {
		Calculator calculator = new Calculator();
		boolean result = calculator.isEven(testValue);
		checkResults(result, "isEven test");
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}