package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

class BankAccount {

    String ownerFirstName;
    int moneyAmount;

    BankAccount(String owner, int money) {
        this.ownerFirstName = owner;
        this.moneyAmount = money;
    }

    String getOwner() { return this.ownerFirstName; }

    int getMoney() { return this.moneyAmount; }
}