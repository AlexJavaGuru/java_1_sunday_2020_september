package javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task28;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
