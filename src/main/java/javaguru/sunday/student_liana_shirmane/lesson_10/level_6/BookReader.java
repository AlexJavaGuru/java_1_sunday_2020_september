package javaguru.sunday.student_liana_shirmane.lesson_10.level_6;
//task14
//task15
//task16
//task17
//task18
//task19
//task20
//task21
//task22
//task23
//task24
//task25

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
@CodeReview(approved = true)
@CodeReviewComment(comment = "public можно не писать в методах описывающих интерфейс" +
        "Они все public по умолчанию")
public interface BookReader {

    boolean checkIfBookExistInList(Book book);

    boolean add(Book book);

    boolean checkBookTitle(Book book);

    boolean checkBookAuthor(Book book);

    boolean remove(Book book);

    void printBookList();

    public ArrayList<Book> findBookByAuthor(String Author);

    public ArrayList<Book> findBookByTitle(String Title);

    public ArrayList<Book> findBookByAuthorPart(String authorPart);

    public boolean markBookIsRead(Book book);

    public boolean markBookIsNotRead(Book book);

    public ArrayList<Book> readBookList();

    public ArrayList<Book> unreadBookList();
}
