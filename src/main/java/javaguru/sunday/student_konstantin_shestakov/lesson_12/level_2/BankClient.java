package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

// Task 9

class BankClient {

    private String uid;
    private String fullName;

    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

}