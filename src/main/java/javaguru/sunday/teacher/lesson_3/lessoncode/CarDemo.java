package main.java.javaguru.sunday.teacher.lesson_3.lessoncode;

public class CarDemo {

    public static void main(String[] args) {
        String name = "Alex";
        Car myFirstCar = new Car();
        System.out.println(myFirstCar.color);

        Car mySecondCar = new Car("White", "BMW");
        System.out.println(mySecondCar.color);
        System.out.println(mySecondCar.manufacture);

        Car myCar = new Car("Yellow", "KIA");

    }
}
