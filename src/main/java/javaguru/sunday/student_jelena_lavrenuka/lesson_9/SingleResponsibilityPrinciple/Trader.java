package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String country, String city) {
        this.fullName = fullName;
        this.country = country;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}