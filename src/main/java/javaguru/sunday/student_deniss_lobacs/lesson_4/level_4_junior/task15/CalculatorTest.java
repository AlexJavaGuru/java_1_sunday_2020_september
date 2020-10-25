package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_4_junior.task15;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxTest();
        calculatorTest.maxTest2();
        calculatorTest.maxOfThreeTest();
        calculatorTest.maxOfThreeTest2();
        calculatorTest.maxOfThreeTest3();
        calculatorTest.maxOfThreeTest4();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_4_junior.task14.Calculator calculator = new main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_4_junior.task14.Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.max(firstNumber , secondNumber);
        if (result == 20) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void maxTest2() {
        int firstNumber = 10;
        int secondNumber = 20;
        Calculator calculator= new Calculator();
        int result = calculator.max(firstNumber , secondNumber);
        if (result == 10) {
            System.out.println("Max test2 = OK");
        } else {
            System.out.println("Max test2 = FAIL");
        }
    }

    public void maxOfThreeTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstNumber , secondNumber , thirdNumber);
        if (result == 30) {
            System.out.println("Max of three test1 = OK");
        } else {
            System.out.println("Max of three test1 = FAIL");
        }
    }

    public void maxOfThreeTest2() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstNumber , secondNumber , thirdNumber);
        if (result == 30) {
            System.out.println("Max of three test2 = OK");
        } else {
            System.out.println("Max of three test2 = FAIL");
        }
    }

    public void maxOfThreeTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstNumber , secondNumber , thirdNumber);
        if (result == 10) {
            System.out.println("Max of three test3 = OK");
        } else {
            System.out.println("Max of three test3 = FAIL");
        }
    }

    public void maxOfThreeTest4() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstNumber , secondNumber , thirdNumber);
        if (result == 10) {
            System.out.println("Max of three test4 = OK");
        } else {
            System.out.println("Max of three test4 = FAIL");
        }
    }

}