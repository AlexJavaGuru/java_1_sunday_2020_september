package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_4;
//task12

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }
}