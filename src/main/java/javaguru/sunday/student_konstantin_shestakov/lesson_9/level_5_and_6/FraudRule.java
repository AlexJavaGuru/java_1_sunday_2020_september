package javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 23 (level 5)
// Task 31 (level 6)

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

    String getRuleName() {
        return ruleName;
    }

}
