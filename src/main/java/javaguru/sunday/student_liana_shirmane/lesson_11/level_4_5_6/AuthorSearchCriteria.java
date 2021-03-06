package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }

}

