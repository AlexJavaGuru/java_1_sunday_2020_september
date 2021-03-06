package javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task4;

// ? Могут ли реализации интерфейса java.util.List хранить одинаковые элементы (дубликаты)

// ! могут


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class Duplicates {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>() {{
            add("New York");
            add("Rio");
            add("New York");
        }};

        for (String city : cities) {
            System.out.println(city);
        }

        List<String> products = new LinkedList<>() {{
            add("apple");
            add("banana");
            add("apple");
        }};

        for (String product : products) {
            System.out.println(product);
        }

    }

}
