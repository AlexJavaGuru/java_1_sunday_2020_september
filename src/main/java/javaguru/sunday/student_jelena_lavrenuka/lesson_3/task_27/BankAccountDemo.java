package javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_27;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
