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

    }

    private static void printGameTable() {

    }

    private static int readUserInput() {
        return 0;
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
