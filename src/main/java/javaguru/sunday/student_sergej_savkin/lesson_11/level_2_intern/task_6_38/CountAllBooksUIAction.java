package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task38

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        int bookCount = bookDatabase.countAllBooks();
        System.out.println("Book count in library is : "+ bookCount);
    }
}
