package javaguru.sunday.student_sergej_savkin.lesson_3.level_5_middle.task_21;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor){

        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void voice(){

        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(dogColor);

    }
}
