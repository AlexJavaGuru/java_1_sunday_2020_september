package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_5;
//task19
//task20
//task21
public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][1] == playerToCheck || field[i][2] == playerToCheck || field[i][3] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            if (field[1][i] == playerToCheck || field[2][i] == playerToCheck || field[3][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
            if ((field[0][0] == playerToCheck || field[1][1] == playerToCheck || field[2][2] == playerToCheck) || (field[0][2] == playerToCheck || field[2][0] == playerToCheck)) {
                return true;
            }

        return false;
    }
}