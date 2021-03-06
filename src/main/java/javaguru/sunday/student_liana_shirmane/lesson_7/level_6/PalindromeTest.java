package javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task12
@CodeReview(approved = true)
public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.willBePalindrome();
    }

    void willBePalindrome() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("Madam, I’m Adam");
        check(result, "Will be Palindrome");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
