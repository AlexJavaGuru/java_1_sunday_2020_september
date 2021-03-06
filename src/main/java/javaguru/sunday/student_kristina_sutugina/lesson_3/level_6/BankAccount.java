package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

//Task_27

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    public String owner;
    public int money;

   String getOwner() {
        return this.owner;
    }

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }
}

