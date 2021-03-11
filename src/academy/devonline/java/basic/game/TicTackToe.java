/*
 * Copyright (c) 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.java.basic.game;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class TicTackToe {

    private static final char EMPTY = ' ';

    private static final char USER = 'X';

    private static final char COMPUTER = 'O';

    private static final char[][] GAME_TABLE = {
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    public static void main(String[] args) {
        printGameRules();
        while (true) {
            int number = readUserInput();
            makeUserProgress(number);
            if (isWinner(USER)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDraw()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            makeComputerProgress();
            printGameTable();
            if (isWinner(COMPUTER)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (isDraw()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printGameTable();
        System.out.println("GAME OVER!");
    }

    private static void printGameRules() {
        char[][] data = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        printData(data);
    }

    private static void printGameTable() {
        printData(GAME_TABLE);
    }

    private static void printData(char[][] data) {
        for (int i = 0; i < 3; i++) {
            printHorizontalLine();
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + data[i][j] + " ");
                if (j == 2) {
                    System.out.println("|");
                }
            }
        }
        printHorizontalLine();
    }

    private static void printHorizontalLine() {
        for (int i = 0; i < 3; i++) {
            System.out.print("----");
        }
        System.out.println("-");
    }

    private static int readUserInput() {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            var userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                var ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    var number = Integer.parseInt(userInput);
                    if (isCellFree(number)) {
                        return number;
                    } else {
                        System.out.println("Cell with number=" + number + " is not free!");
                    }
                }
            }
        }
    }

    private static boolean isCellFree(int number) {
        int[] indexes = toIndexes(number);
        return GAME_TABLE[indexes[0]][indexes[1]] == EMPTY;
    }

    private static int[] toIndexes(int number) {
        if (number == 1) {
            return new int[]{2, 0};
        } else if (number == 2) {
            return new int[]{2, 1};
        } else if (number == 3) {
            return new int[]{2, 2};
        } else if (number == 4) {
            return new int[]{1, 0};
        } else if (number == 5) {
            return new int[]{1, 1};
        } else if (number == 6) {
            return new int[]{1, 2};
        } else if (number == 7) {
            return new int[]{0, 0};
        } else if (number == 8) {
            return new int[]{0, 1};
        } else {
            return new int[]{0, 2};
        }
    }

    private static void makeUserProgress(int number) {

    }

    private static void makeComputerProgress() {

    }

    private static boolean isWinner(char ch) {
        return false;
    }

    private static boolean isDraw() {
        return false;
    }
}
