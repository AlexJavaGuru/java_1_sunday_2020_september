package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_4_junior;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}