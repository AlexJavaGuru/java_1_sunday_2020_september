package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_4_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] myArray = new String[7];
        myArray[0] = "Monday";
        myArray[1] = "Tuesday";
        myArray[2] = "Wednesday";
        myArray[3] = "Thursday";
        myArray[4] = "Friday";
        myArray[5] = "Saturday";
        myArray[6] = "Sunday";

        if (number >= 1 && number <= 7) {
            return myArray[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}