package main.java.javaguru.sunday.student_mihails_gutmans.lesson4.level4;

public class Calculator {

        public int sum(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }

        public int sub(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }

        public int mult(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }

        public int dev(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }

        public boolean isEven(int number) {
            if (number % 2 == 0) {
                return true;
            }
            return false;
        }

        public int maxNumberOfTwo (int firstNumber, int secondNumber) {
            if(firstNumber>secondNumber){
                return firstNumber;
            }
                return secondNumber;
        }
        public  int maxNumberOfThree (int firstNumber, int secondNumber , int thirdNumber){
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                return firstNumber;
            }
            if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                return secondNumber;
            } return thirdNumber;
        }
}
