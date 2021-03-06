package javaguru.sunday.student_liana_shirmane.lesson_13.level_5;
//task26
//task27
//task28
//task29
//task30
//task31

import javaguru.sunday.teacher.annotations.CodeReview;

import static java.lang.Integer.parseInt;

@CodeReview(approved = true)
public class StringCalculator {

    static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("[\n]");
            delimiter = parts[0].substring(3, 4);
            numbers = parts[1];
            int Sum = 0;
            String[] number = numbers.split(delimiter);
            for (String s : number) {
                Sum = Sum + Integer.parseInt(s);
            }
            return Sum;
        } else if (numbers.contains(",") || numbers.contains("\n")) {
            int Sum = 0;
            String[] number = numbers.split(delimiter);
            for (String s : number) {
                Sum = Sum + Integer.parseInt(s);
            }
            return Sum;
        } else {
            return parseInt(numbers);
        }
    }
}
