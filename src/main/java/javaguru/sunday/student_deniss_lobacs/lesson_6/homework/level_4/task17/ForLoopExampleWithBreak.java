package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task17;

public class ForLoopExampleWithBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50){
                break;
            }
        }
    }
}