package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_1.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 1
@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }

}
