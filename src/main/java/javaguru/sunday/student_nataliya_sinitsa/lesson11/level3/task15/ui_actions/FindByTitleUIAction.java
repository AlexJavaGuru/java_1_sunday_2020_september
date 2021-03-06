package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByTitleUIAction implements UIAction {


    private BookDatabaseV2 bookDatabase;

    public FindByTitleUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a title:");
        String title = scanner.nextLine();
        List<Book> bookListByTitle = bookDatabase.findByTitle(title);
        System.out.println("The book list with title " + title + " is: " + bookListByTitle.toString());
    }

}

