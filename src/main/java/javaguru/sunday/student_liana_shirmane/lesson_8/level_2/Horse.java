package javaguru.sunday.student_liana_shirmane.lesson_8.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

//task7
//Например, если мы хотим сделать пегаса и единорога,
// то проще сначала сделать лошадь и потом добавть ей крылья или рог
@CodeReview(approved = true)
public class Horse {
    String color;
    int age;
    String name;

    public Horse(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }
}
