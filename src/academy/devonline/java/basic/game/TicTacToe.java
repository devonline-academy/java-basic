package academy.devonline.java.basic.game;

import java.util.Random;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        if (new Random().nextBoolean()) {
            makeComputerMove();
            printGameTable();
        }
        while (true) {
            makeUserMove();
            printGameTable();
            if (isUserWin()) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDraw()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            makeComputerMove();
            printGameTable();
            if (isComputerWin()) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (isDraw()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }

    private static void printTableMapping() {

    }

    private static void printGameTable() {

    }

    private static void makeUserMove() {

    }

    private static void makeComputerMove() {

    }

    private static boolean isUserWin() {
        return false;
    }

    private static boolean isComputerWin() {
        return false;
    }

    private static boolean isDraw() {
        return false;
    }
}
