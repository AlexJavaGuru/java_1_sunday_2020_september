package javaguru.sunday.student_liana_shirmane.lesson_9.level_2;
//task8

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;

}

//Модификатор защищенного доступа нельзя использовать для классов верхнего уровня.
//Согласно документации джава.
//protected модификатор доступа означает, что он виден только внутри заключающего класса и любых подклассов,
// а также в любом месте пакета заключающего класса. Ни одно тело не знает, какие классы будут подклассом защищенного класса.
// Так что это не имеет смысла