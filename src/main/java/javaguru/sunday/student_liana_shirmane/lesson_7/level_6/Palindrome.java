package javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task12
@CodeReview(approved = true)
public class Palindrome {

    boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[-+.^:,'’ ]","");
        System.out.println(text);
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
