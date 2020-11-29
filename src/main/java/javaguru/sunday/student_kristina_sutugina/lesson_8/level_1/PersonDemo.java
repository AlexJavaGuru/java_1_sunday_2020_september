package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_1;
//Task_3

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Для создания объекта Person используется выражение new Person().
// Оператор new выделяет память для объекта Person. И затем вызывается конструктор по умолчанию,
// который не принимает никаких параметров. В итоге после выполнения данного выражения в памяти будет выделен участок,
// где будут храниться все данные объекта Person. А переменная tom получит ссылку на созданный объект.
//Если конструктор не инициализирует значения переменных объекта, то они получают значения по умолчанию.
// Для переменных числовых типов это число 0, а для типа string и классов - это значение null (то есть фактически отсутствие значения).
//После создания объекта мы можем обратиться к переменным объекта Person через переменную person и установить или получить их значения,
// например, person.name = "Kristina".
@CodeReview(approved = true)
class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.print();
    }
}
