package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_7_8;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.inMemoryDatabaseTest();
    }

    public void inMemoryDatabaseTest() {
        InMemoryDatabase victim = new InMemoryDatabase();
        Product product = new Product("Coca-Cola");
        Product product1 = new Product("Fanta");
        Product product2 = new Product("Sprite");
        victim.save(product);
        victim.save(product1);
        victim.save(product2);
        if (victim.findByTitle("Fanta").equals(product1)) {
            System.out.println("inMemoryDatabaseTest is OK");
        }else{
            System.out.println("inMemoryDatabaseTest is failed");
        }
    }
}