package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

// Task_17

public class ContinueWithForExample {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            System.out.println(i);
            if (i > 3)
                continue;
            System.out.println("continue example");
        }
    }
}