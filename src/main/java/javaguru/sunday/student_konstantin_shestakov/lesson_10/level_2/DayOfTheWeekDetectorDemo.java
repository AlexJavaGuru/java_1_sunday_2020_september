package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 5
@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);
        String detectDayName = dayOfTheWeekDetector.detectDayName(1);
        String detectDayNameSwitch = dayOfTheWeekDetector.detectDayNameSwitch(2);
        String detectDayNameArray = dayOfTheWeekDetector.detectDayNameArray(3);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorImpl();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);
        dayOfTheWeekDetectorDemo.run();
    }
}
