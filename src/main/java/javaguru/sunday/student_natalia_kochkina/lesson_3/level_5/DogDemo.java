package javaguru.sunday.student_natalia_kochkina.lesson_3.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog newDog = new Dog("Bulka", 3, "red");
        newDog.voice();
        newDog.happyBirthday();
        newDog.changeColor("Blue");
        newDog.voice();
    }
}
