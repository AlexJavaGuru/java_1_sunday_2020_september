package javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard("2255669977885412", 1234, 0, 0, 0);
        myCreditCard.deposit(1234, 300);
        myCreditCard.withdraw(1234, 500);
        myCreditCard.printInformation();
    }
}
