package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3;

//Task_6
@FunctionalInterface
public interface FunctionalInterfaceExample {

    void someMethod();

    default void someDefaultMethod() {
        System.out.println("123");
    }
}
//Функциональный интерфейс - интерфейс, имеющий только 1 абстрактный метод.
//При этом дефолтных методов у него может быть множество.