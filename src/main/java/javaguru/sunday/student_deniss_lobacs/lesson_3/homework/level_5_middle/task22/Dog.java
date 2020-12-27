package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_5_middle.task22;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name;
    String color;
    int age;

    public Dog(String dogName , int dogAge , String dogColor) {

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;

    }
    public void doVoice() {

        System.out.println(name + " " + age + " " + color);
    }

    public void happyBirhtday() {

        System.out.println("Happy birthday!!!");
        age = age+1;

    }

    void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
      this.color = newColor;

    }
}
