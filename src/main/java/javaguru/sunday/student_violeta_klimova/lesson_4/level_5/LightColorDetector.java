package javaguru.sunday.student_violeta_klimova.lesson_4.level_5;

class LightColorDetector {

    public String detect(int wavelength) {
        String lightColor;

        if (wavelength >= 380 && wavelength <= 449) {
            lightColor = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            lightColor = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            lightColor = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            lightColor = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            lightColor = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            lightColor = "Red";
        } else {
            lightColor = "Invisible Light";
        }

        return lightColor;
    }

}