package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6.task_28;

public class ComputerDemo {


    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
