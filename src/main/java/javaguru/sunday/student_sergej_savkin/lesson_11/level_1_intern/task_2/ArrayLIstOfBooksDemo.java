package javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.LinkedList;
import java.util.List;

@CodeReview(approved = true)
class ArrayLIstOfBooksDemo {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new Book("Harry Potter", "Johan Rolling", 350));
        books.add(new Book("War and Peace", "Tolstoj", 654132165));
        books.add(new Book("Robinzon Kruzo", "Daniel Defo", 150));

        System.out.println(books.toString());

    }
}
