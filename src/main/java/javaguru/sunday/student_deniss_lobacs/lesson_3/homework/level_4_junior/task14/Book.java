package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_4_junior.task14;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {
    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}
