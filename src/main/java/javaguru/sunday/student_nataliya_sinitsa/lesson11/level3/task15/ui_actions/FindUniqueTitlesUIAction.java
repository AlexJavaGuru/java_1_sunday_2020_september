package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Titles of books available in library: " + bookDatabase.findUniqueTitles().toString());
    }

}
