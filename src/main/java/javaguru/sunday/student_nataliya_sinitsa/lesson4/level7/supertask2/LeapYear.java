package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level7.supertask2;

class LeapYear {

    // return true - если год високосный
    // return false - если год обычный

    public boolean isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;

    }

}