package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7;

//Task 7 -> Task 8
// данный интерфейс не является функциональным
// Multiple non-overriding abstract methods found in interface
// main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7.Database

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}