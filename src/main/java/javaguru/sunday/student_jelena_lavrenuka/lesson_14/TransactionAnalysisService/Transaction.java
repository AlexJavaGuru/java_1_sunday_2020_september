package javaguru.sunday.student_jelena_lavrenuka.lesson_14.TransactionAnalysisService;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return year == that.year &&
                value == that.value &&
                trader.equals(that.trader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader, year, value);
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}
