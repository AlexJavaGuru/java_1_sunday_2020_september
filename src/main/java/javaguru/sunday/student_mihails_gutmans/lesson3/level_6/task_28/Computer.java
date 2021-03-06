package javaguru.sunday.student_mihails_gutmans.lesson3.level_6.task_28;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Computer {


    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){
        return manufacturer;
    }

    String getModel(){
        return model;
    }
}
