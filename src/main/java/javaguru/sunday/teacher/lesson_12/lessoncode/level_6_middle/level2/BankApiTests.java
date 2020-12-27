package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle.level2;

import java.util.List;
import java.util.Optional;

public class BankApiTests {

    public static void main(String[] args) {
        BankApiTests testRunner = new BankApiTests();

        testRunner.test1();
        testRunner.test2();
    }

    private void test1() {
        List<BankClient> clients = List.of(
                new BankClient("1", "Alex"),
                new BankClient("2", "Irina"),
                new BankClient("3", "Victor")
        );
        BankApiImpl victim = new BankApiImpl(clients);

        UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.OBSERVER));
        try {
            victim.findByUid(invalidUserCredentials, "2");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("Test has passed!");
        }
    }

    private void test2() {
        List<BankClient> clients = List.of(
                new BankClient("1", "Alex"),
                new BankClient("2", "Irina"),
                new BankClient("3", "Victor")
        );
        BankApiImpl victim = new BankApiImpl(clients);

        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        BankClient expectedResult = new BankClient("2", "Irina");
        try {
            Optional<BankClient> result = victim.findByUid(validUserCredentials, "2");

//            if (result.isPresent()) {
//                checkResults(result.get().equals(expectedResult), "Test2");
//            }
            result.ifPresent(bankClient -> checkResults(bankClient.equals(expectedResult), "Test2"));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
