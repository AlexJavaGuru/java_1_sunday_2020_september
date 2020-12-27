package main.java.javaguru.sunday.student_kristina_sutugina.lesson_10.level_6;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_1.task7.ArrayLength1;

import java.util.ArrayList;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
       bookReaderImplTest.addBookTest();
        bookReaderImplTest.checkIsAuthorAndNameTest();
    }

   public void addBookTest(){
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Code", "Martin");
        Book book2 = new Book("Margo", "Arthur Douglas");
        boolean condition = bookReaderImpl.addBook(book);
        boolean condition2=bookReaderImpl.addBook(book2);
        boolean condition3=bookReaderImpl.addBook(book);
        check(condition, "addBookTest added book");
        check(condition2, "addBookTest added book 2");
        check(condition3, "addBookTest added book");
    }
    public void checkIsAuthorAndNameTest(){
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Code", "Martin");
        Book book2 = new Book("Margo", "");
        Book book3= new Book("", "Margo");
        Book book4= new Book("", "");
        boolean condition = bookReaderImpl.checkIsAuthorAndName(book);
        boolean condition2=bookReaderImpl.checkIsAuthorAndName(book2);
        boolean condition3=bookReaderImpl.checkIsAuthorAndName(book3);
        boolean condition4=bookReaderImpl.checkIsAuthorAndName(book4);
        check(condition, "checkIsAuthorAndNameTest all info is");
        check(condition2, "checkIsAuthorAndNameTest no author");
        check(condition3, "checkIsAuthorAndNameTest no name");
        check(condition4, "checkIsAuthorAndNameTest no name and author");
    }
    public void check(boolean condition, String testName){
        if(condition){
            System.out.println(testName+" passed");
        }else{
            System.out.println(testName+" failed");
        }
    }
}
