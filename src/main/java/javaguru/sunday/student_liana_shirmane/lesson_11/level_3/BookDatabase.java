package javaguru.sunday.student_liana_shirmane.lesson_11.level_3;
//task22

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
public interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);
}
