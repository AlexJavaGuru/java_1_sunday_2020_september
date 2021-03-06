package javaguru.sunday.student_nataliya_sinitsa.lesson8.level3.task13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Bottle {

    public String material;
    public double volume;
    public String colour;
    public boolean isOpen;
    public boolean isFull;

    public Bottle(double volume, String colour, boolean isOpen, boolean isFull) {
    }

    abstract void openBottle();

    abstract void closeBottle();

    public void fillBottle() {
        isFull = true;
    }

    public void emptyBottle() {
        isFull = false;
    }

}
