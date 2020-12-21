package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_6;

/* Функциональный интерфейс (functional interface) – это интерфейс у которого только один абстрактный метод.
Функциональный интерфейс может содержать любое количество методов по умолчанию (default) или статических методов.
Например: */

@java.lang.FunctionalInterface
interface FunctionalInterface {

    default int defaultMethod() {
        return 0;
    }
    void method();
}
