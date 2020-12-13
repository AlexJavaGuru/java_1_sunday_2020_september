package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.BookReader;

// lesson_10 task_14
// lesson_10 task_15
// lesson_10 task_16
// lesson_10 task_17
// lesson_10 task_18
// lesson_10 task_19
// lesson_10 task_20
// lesson_10 task_21
// lesson_10 task_22
// lesson_10 task_23
// lesson_10 task_24
// lesson_10 task_25

import java.util.ArrayList;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.addBookToLibraryTest();
        test.deleteBookFromLibraryTest();
        test.findBookByAuthorTest();
        test.findBookAuthorByNotFullNameTest();
        test.findBookByTitleTest();
        test.findBookByNotFullTitleTest();
        test.markBookAsReadTest();
        test.markBookAsUnReadTest();
        test.readBooksListTest();
        test.unReadBooksListTest();

    }

    Book book1 = new Book("The Adventures of Tom Sawyer", "Mark Twain", false);
    Book book2 = new Book("Alice in Wonderland", "Lewis Carroll", false);
    Book book3 = new Book("Sherlock Holmes", "Arthur Conan Doyle", false);
    Book book4 = new Book("The Adventures of Huckleberry Finn", "Mark Twain", false);


    public void addBookToLibraryTest() {
        BookReader victim = new BookReaderImpl();
        boolean result = victim.addBookToLibrary(book1);
        testResult(result, "addBookToLibraryTest");
    }

    public void deleteBookFromLibraryTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        boolean result = victim.deleteBookFromLibrary(book3);
        testResult(result, "deleteBookFromLibraryTest");
    }

    public void findBookByAuthorTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(book4);
        ArrayList<Book> testList = victim.findBookByAuthor("Mark Twain");
        System.out.println("");
        System.out.println("findBookByAuthorTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }

    public void findBookAuthorByNotFullNameTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(book4);
        ArrayList<Book> testList = victim.findBookByNotFullAuthorsName("Mark");
        System.out.println("");
        System.out.println("findBookAuthorByNotFullNameTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }

    public void findBookByTitleTest(){
        BookReader victim = new BookReaderImpl();
        Book testBook = new Book("The Adventures of Tom Sawyer", "Lewis Carroll", false);
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(testBook);
        ArrayList<Book> testList = victim.findBookByTitle("The Adventures of Tom Sawyer");
        System.out.println("");
        System.out.println("findBookByTitleTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }

    public void findBookByNotFullTitleTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(book4);
        ArrayList<Book> testList = victim.findBookByNotFullTitle("The");
        System.out.println("");
        System.out.println("findBookByNotFullTitleTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }

    public void markBookAsReadTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        boolean result = victim.markBookAsRead(book1);
        System.out.println("");
        testResult(result, "markBookAsReadTest");
    }

    public void markBookAsUnReadTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        boolean result = victim.markBookAsUnRead(book1);
        System.out.println("");
        testResult(result, "markBookAsUnReadTest");
    }

    public void readBooksListTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(book4);
        victim.markBookAsRead(book1);
        victim.markBookAsRead(book2);
        ArrayList<Book> testList = victim.readBooksList();
        System.out.println("");
        System.out.println("readBooksListTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }

    public void unReadBooksListTest(){
        BookReader victim = new BookReaderImpl();
        victim.addBookToLibrary(book1);
        victim.addBookToLibrary(book2);
        victim.addBookToLibrary(book3);
        victim.addBookToLibrary(book4);
        victim.markBookAsRead(book1);
        victim.markBookAsRead(book2);
        ArrayList<Book> testList = victim.unReadBooksList();
        System.out.println("");
        System.out.println("unReadBooksListTest");
        for (Book print:testList) {
            System.out.println(print);
        }
    }
    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

}
