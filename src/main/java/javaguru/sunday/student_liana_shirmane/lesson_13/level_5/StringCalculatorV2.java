package javaguru.sunday.student_liana_shirmane.lesson_13.level_5;
//task26
//task27
//task28
//task29
//task30
//task31

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.stream.Stream;

@CodeReview(approved = true)
public class StringCalculatorV2 {

    static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = ",|\n";
        char[] delimiters;
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n");

            delimiters = parts[0].substring(2).toCharArray();
            numbers = parts[1];
        }

        Stream<String> numbersSum = Arrays.stream(numbers.split(delimiter));
        return numbersSum.mapToInt(Integer::parseInt).sum();
        }
    }

