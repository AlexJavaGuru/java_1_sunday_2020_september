package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level6.task14;

//Task 14 -> 25

import java.util.ArrayList;
import java.util.List;

interface BookReader {


    boolean bookHasAuthorAndTitle(Book newBook);

    boolean addBook(Book newBook);

    boolean removeBook(Book bookToRemove);

    String[] availableBooks();

    List<Book> bookListByAuthor(String requestedAuthor);

    List<Book> bookListByPartOfAuthorName(String partOfRequestedAuthorName);

    List<Book> bookListByTitle(String requestedTitle);

    List<Book> bookListByPartOfTitle(String partOfRequestedTitle);

    boolean markAsRead(Book bookToMark);

    boolean markAsUnread(Book bookToMark);

    List<Book> listOfReadBooks();

    List<Book> listOfUnreadBooks();

}
