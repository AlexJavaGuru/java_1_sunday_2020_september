package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_19
//Task_26
@CodeReview(approved = true)
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }
}
