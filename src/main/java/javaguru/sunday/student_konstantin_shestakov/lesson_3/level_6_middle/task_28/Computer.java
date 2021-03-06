package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_28;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){
        return this.manufacturer;
    }

    String getModel(){
        return this.model;
    }

}
