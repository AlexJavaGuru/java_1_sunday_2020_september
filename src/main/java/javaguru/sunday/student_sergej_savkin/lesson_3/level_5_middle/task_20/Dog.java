package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_5_middle.task_20;

class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge){

        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    void voice(){

        System.out.println(dogName);
        System.out.println(dogAge);

    }
    int happyBirthday() {
        dogAge = dogAge +1;
        return dogAge;
    }
}
