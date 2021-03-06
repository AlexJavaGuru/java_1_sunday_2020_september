package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task 30
@CodeReview(approved = true)
class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
       this.fraud = fraud;
       this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}