package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.*;

@CodeReview(approved = true)
class GetAuthorToBooksMapUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        for (Map.Entry<String, List<Book>> stringListEntry : authorToBooksMap.entrySet()) {
            System.out.println("Key: " + stringListEntry.getKey() + " Value: "
                    + stringListEntry.getValue());
        }
    }
}
