package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_1_intern.task3;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        int age = person.getAge();
        String name = person.getFullName();
        Address address = person.getAddress();

        System.out.println(age);
        System.out.println(name);
        System.out.println(address);
    }
}
