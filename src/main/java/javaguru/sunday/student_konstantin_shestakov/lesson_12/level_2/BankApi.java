package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

// Task 10

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}