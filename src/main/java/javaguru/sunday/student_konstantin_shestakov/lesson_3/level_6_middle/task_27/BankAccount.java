package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_27;

class BankAccount {

    String owner;
    int money;

    BankAccount(String ownerFirstName, int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
