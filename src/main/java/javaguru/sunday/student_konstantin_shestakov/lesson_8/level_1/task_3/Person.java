package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_1.task_3;

// Task 3

class Person {

    private String fullName;
    private int age;
    private Address address;

//    public Person() {
//        this.fullName = fullName;
//        this.age = age;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }
}
