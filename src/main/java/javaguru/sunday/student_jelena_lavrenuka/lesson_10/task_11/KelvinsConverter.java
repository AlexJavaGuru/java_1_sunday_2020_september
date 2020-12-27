package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class KelvinsConverter implements TemperatureConverter{
    @Override
    public double temperatureConverter(double degree) {
        return degree + 273.15;
    }
}
