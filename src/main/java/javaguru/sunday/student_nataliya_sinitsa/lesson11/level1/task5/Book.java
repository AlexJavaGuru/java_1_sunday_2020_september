package javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Book {

    private String title;
    private String author;
    private boolean isInList;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isInList = false;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isInList() {
        return isInList;
    }

    public void setInList(boolean inList) {
        isInList = inList;
    }

}


