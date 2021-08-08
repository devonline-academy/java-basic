package academy.devonline.java.basic.game;

import java.util.Random;
import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class TicTackToeWithoutDecomposition {

    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + mappingTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        if (new Random().nextBoolean()) {
            Random random = new Random();
            while (true) {
                int row = random.nextInt(3);
                int col = random.nextInt(3);
                if (gameTable[row][col] == ' ') {
                    gameTable[row][col] = 'O';
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + gameTable[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");
        }
        while (true) {
            userMadeMove:
            while (true) {
                System.out.println("Please type number between 1 and 9:");
                String string = new Scanner(System.in).nextLine();
                if (string.length() == 1) {
                    char digit = string.charAt(0);
                    if (digit >= '1' && digit <= '9') {
                        tryAgain:
                        for (int i = 0; i < mappingTable.length; i++) {
                            for (int j = 0; j < mappingTable[i].length; j++) {
                                if (mappingTable[i][j] == digit) {
                                    if (gameTable[i][j] == ' ') {
                                        gameTable[i][j] = 'X';
                                        break userMadeMove;
                                    } else {
                                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                                        break tryAgain;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + gameTable[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");
            boolean isUserWin = false;
            for (int i = 0; i < 3; i++) {
                if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == 'X') {
                    isUserWin = true;
                    break;
                }
            }
            if (!isUserWin) {
                for (int i = 0; i < 3; i++) {
                    if (gameTable[0][i] == gameTable[1][i] && gameTable[0][i] == gameTable[2][i] && gameTable[0][i] == 'X') {
                        isUserWin = true;
                        break;
                    }
                }
                if (!isUserWin) {
                    if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'X') {
                        isUserWin = true;
                    }
                }
                if (!isUserWin) {
                    if (gameTable[0][2] == gameTable[1][1] && gameTable[0][2] == gameTable[2][0] && gameTable[0][2] == 'X') {
                        isUserWin = true;
                    }
                }
            }
            if (isUserWin) {
                System.out.println("YOU WIN!");
                break;
            }
            boolean isDraw = true;
            returnFromIsDrawAfterComputerMove:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameTable[i][j] == ' ') {
                        isDraw = false;
                        break returnFromIsDrawAfterComputerMove;
                    }
                }
            }
            if (isDraw) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            Random random = new Random();
            while (true) {
                int row = random.nextInt(3);
                int col = random.nextInt(3);
                if (gameTable[row][col] == ' ') {
                    gameTable[row][col] = 'O';
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + gameTable[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");
            boolean isComputerWin = false;
            for (int i = 0; i < 3; i++) {
                if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == 'O') {
                    isComputerWin = true;
                    break;
                }
            }
            if (!isComputerWin) {
                for (int i = 0; i < 3; i++) {
                    if (gameTable[0][i] == gameTable[1][i] && gameTable[0][i] == gameTable[2][i] && gameTable[0][i] == 'O') {
                        isComputerWin = true;
                        break;
                    }
                }
                if (!isComputerWin) {
                    if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'O') {
                        isComputerWin = true;
                    }
                }
                if (!isComputerWin) {
                    if (gameTable[0][2] == gameTable[1][1] && gameTable[0][2] == gameTable[2][0] && gameTable[0][2] == 'O') {
                        isComputerWin = true;
                    }
                }
            }
            if (isComputerWin) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            isDraw = true;
            returnFromIsDrawAfterComputerMove:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameTable[i][j] == ' ') {
                        isDraw = false;
                        break returnFromIsDrawAfterComputerMove;
                    }
                }
            }
            if (isDraw) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }
}
