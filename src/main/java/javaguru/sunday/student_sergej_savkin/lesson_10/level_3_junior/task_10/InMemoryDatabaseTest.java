package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_10;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.findByTitleTest();
    }

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

    public void findByTitleTest(){
        inMemoryDatabase.save(new Product("Tea"));
        inMemoryDatabase.save(new Product("Milk"));
        inMemoryDatabase.save(new Product("Bread"));
        inMemoryDatabase.save(new Product("Coffee"));
        inMemoryDatabase.save(new Product("Bread"));

        check(inMemoryDatabase.findByTitle("Milk").get().getTitle(), "Milk", "findByTitleTest");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}