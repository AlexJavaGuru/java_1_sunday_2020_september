package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task7
//нет, тут больше одного абстрактного метода

//task10

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Optional;
@CodeReview(approved = true)
interface Database2 {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}



