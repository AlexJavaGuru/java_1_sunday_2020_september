package javaguru.sunday.student_liana_shirmane.lesson_3.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Marshall");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot myOtherRobot = new Robot("Rider");
        myOtherRobot.sayHello();
        myOtherRobot.sayYourName();

        Robot myThirdRobot = new Robot("John");
        myThirdRobot.sayHello();
        myThirdRobot.sayYourName();
    }
}
