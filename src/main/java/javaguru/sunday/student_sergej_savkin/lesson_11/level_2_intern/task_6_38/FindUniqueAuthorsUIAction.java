package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.HashSet;
import java.util.Set;

//task38

@CodeReview(approved = true)
class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> foundUniqueAuthors;
        foundUniqueAuthors = bookDatabase.findUniqueAuthors();
        for (String author : foundUniqueAuthors) {
            System.out.println("Unique author in library: " + author);
        }
    }
}
