package javaguru.sunday.student_sergej_savkin.lesson_3.level_4_junior.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
