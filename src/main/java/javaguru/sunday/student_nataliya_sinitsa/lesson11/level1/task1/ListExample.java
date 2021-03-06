package javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class ListExample {

    List<String> cities = new ArrayList<>() {{
        add("New York");
        add("Rio");
        add("Tokyo");
    }};

    List<String> products = new LinkedList<>() {{
        add("apple");
        add("banana");
        add("coconut");
    }};

}
/*ArrayList - это список на основе массива.
LinkedList - связанный список на основе элементов и связи между ними.
В качестве LinkedList лучше всего подходит представление вагонов поезда сцепленных последовательно.

ArrayList следует использовать, когда в приоритете доступ по индексу,
так как эти операции выполняются за константное время.
Добавление в конец списка в среднем тоже выполняется за константное время.
Кроме того в ArrayList нет дополнительных расходов на хранение связки между элементами.
Минусы в скорости вставки/удаления элементов находящихся не в конце списка,
так как при этой операции все элементы правее добавляемого/удаляемого сдвигаются.

LinkedList удобен когда важнее быстродействие операций вставки/удаления,
которые в LinkedList выполняются за константное время.
Операции доступа по индексу производятся перебором с начала или конца
(смотря что ближе) до нужного элемента. Дополнительные затраты на хранение связки между элементами.

Одним словом - если часто вставляете/удаляете - выбирайте в пользу LinkedList, в противном случае ArrayList*/