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

import java.util.Random;
import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class TicTackToeWithoutDecomposition {

    private static final char EMPTY = ' ';

    private static final char USER = 'X';

    private static final char COMPUTER = 'O';

    private static final char[][] GAME_TABLE = {
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    public static void main(String[] args) {
        char[][] data = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("----");
            }
            System.out.println("-");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + data[i][j] + " ");
                if (j == 2) {
                    System.out.println("|");
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("----");
        }
        System.out.println("-");
        if (new Random().nextBoolean()) {
            while (true) {
                int number = new Random().nextInt(9) + 1;
                int[] indexes;
                if (number == 1) {
                    indexes = new int[]{2, 0};
                } else if (number == 2) {
                    indexes = new int[]{2, 1};
                } else if (number == 3) {
                    indexes = new int[]{2, 2};
                } else if (number == 4) {
                    indexes = new int[]{1, 0};
                } else if (number == 5) {
                    indexes = new int[]{1, 1};
                } else if (number == 6) {
                    indexes = new int[]{1, 2};
                } else if (number == 7) {
                    indexes = new int[]{0, 0};
                } else if (number == 8) {
                    indexes = new int[]{0, 1};
                } else {
                    indexes = new int[]{0, 2};
                }
                if (GAME_TABLE[indexes[0]][indexes[1]] == EMPTY) {
                    GAME_TABLE[indexes[0]][indexes[1]] = COMPUTER;
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("----");
                }
                System.out.println("-");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + GAME_TABLE[i][j] + " ");
                    if (j == 2) {
                        System.out.println("|");
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.print("----");
            }
            System.out.println("-");
        }
        while (true) {
            int number;
            while (true) {
                System.out.println("Please type number between 1 and 9:");
                var userInput = new Scanner(System.in).nextLine();
                if (userInput.length() == 1) {
                    var ch = userInput.charAt(0);
                    if (ch >= '1' && ch <= '9') {
                        number = Integer.parseInt(userInput);
                        int[] indexes;
                        if (number == 1) {
                            indexes = new int[]{2, 0};
                        } else if (number == 2) {
                            indexes = new int[]{2, 1};
                        } else if (number == 3) {
                            indexes = new int[]{2, 2};
                        } else if (number == 4) {
                            indexes = new int[]{1, 0};
                        } else if (number == 5) {
                            indexes = new int[]{1, 1};
                        } else if (number == 6) {
                            indexes = new int[]{1, 2};
                        } else if (number == 7) {
                            indexes = new int[]{0, 0};
                        } else if (number == 8) {
                            indexes = new int[]{0, 1};
                        } else {
                            indexes = new int[]{0, 2};
                        }
                        if (GAME_TABLE[indexes[0]][indexes[1]] == EMPTY) {
                            break;
                        } else {
                            System.out.println("Cell with number=" + number + " is not free!");
                        }
                    }
                }
            }
            int[] indexes;
            if (number == 1) {
                indexes = new int[]{2, 0};
            } else if (number == 2) {
                indexes = new int[]{2, 1};
            } else if (number == 3) {
                indexes = new int[]{2, 2};
            } else if (number == 4) {
                indexes = new int[]{1, 0};
            } else if (number == 5) {
                indexes = new int[]{1, 1};
            } else if (number == 6) {
                indexes = new int[]{1, 2};
            } else if (number == 7) {
                indexes = new int[]{0, 0};
            } else if (number == 8) {
                indexes = new int[]{0, 1};
            } else {
                indexes = new int[]{0, 2};
            }
            GAME_TABLE[indexes[0]][indexes[1]] = USER;
            boolean isUserWinner = false;
            for (int i = 0; i < 3; i++) {
                if (GAME_TABLE[i][0] == GAME_TABLE[i][1] &&
                        GAME_TABLE[i][1] == GAME_TABLE[i][2] &&
                        GAME_TABLE[i][1] == USER) {
                    isUserWinner = true;
                    break;
                }
            }
            if (!isUserWinner) {
                for (int i = 0; i < 3; i++) {
                    if (GAME_TABLE[0][i] == GAME_TABLE[1][i] &&
                            GAME_TABLE[1][i] == GAME_TABLE[2][i] &&
                            GAME_TABLE[1][i] == USER) {
                        isUserWinner = true;
                        break;
                    }
                }
                if (!isUserWinner) {
                    if (GAME_TABLE[0][0] == GAME_TABLE[1][1] &&
                            GAME_TABLE[1][1] == GAME_TABLE[2][2] &&
                            GAME_TABLE[1][1] == USER) {
                        isUserWinner = true;
                    } else if (GAME_TABLE[2][0] == GAME_TABLE[1][1] &&
                            GAME_TABLE[1][1] == GAME_TABLE[0][2] &&
                            GAME_TABLE[1][1] == USER) {
                        isUserWinner = true;
                    } else {
                        isUserWinner = false;
                    }
                }
            }
            if (isUserWinner) {
                System.out.println("YOU WIN!");
                break;
            }
            boolean isDraw = true;
            exit:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (GAME_TABLE[i][j] == EMPTY) {
                        isDraw = false;
                        break exit;
                    }
                }
            }
            if (isDraw) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            while (true) {
                number = new Random().nextInt(9) + 1;
                if (number == 1) {
                    indexes = new int[]{2, 0};
                } else if (number == 2) {
                    indexes = new int[]{2, 1};
                } else if (number == 3) {
                    indexes = new int[]{2, 2};
                } else if (number == 4) {
                    indexes = new int[]{1, 0};
                } else if (number == 5) {
                    indexes = new int[]{1, 1};
                } else if (number == 6) {
                    indexes = new int[]{1, 2};
                } else if (number == 7) {
                    indexes = new int[]{0, 0};
                } else if (number == 8) {
                    indexes = new int[]{0, 1};
                } else {
                    indexes = new int[]{0, 2};
                }
                if (GAME_TABLE[indexes[0]][indexes[1]] == EMPTY) {
                    GAME_TABLE[indexes[0]][indexes[1]] = COMPUTER;
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("----");
                }
                System.out.println("-");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + GAME_TABLE[i][j] + " ");
                    if (j == 2) {
                        System.out.println("|");
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.print("----");
            }
            System.out.println("-");
            boolean isComputerWinner = false;
            for (int i = 0; i < 3; i++) {
                if (GAME_TABLE[i][0] == GAME_TABLE[i][1] &&
                        GAME_TABLE[i][1] == GAME_TABLE[i][2] &&
                        GAME_TABLE[i][1] == COMPUTER) {
                    isComputerWinner = true;
                    break;
                }
            }
            if (!isComputerWinner) {
                for (int i = 0; i < 3; i++) {
                    if (GAME_TABLE[0][i] == GAME_TABLE[1][i] &&
                            GAME_TABLE[1][i] == GAME_TABLE[2][i] &&
                            GAME_TABLE[1][i] == COMPUTER) {
                        isComputerWinner = true;
                        break;
                    }
                }
                if (!isComputerWinner) {
                    if (GAME_TABLE[0][0] == GAME_TABLE[1][1] &&
                            GAME_TABLE[1][1] == GAME_TABLE[2][2] &&
                            GAME_TABLE[1][1] == COMPUTER) {
                        isComputerWinner = true;
                    } else if (GAME_TABLE[2][0] == GAME_TABLE[1][1] &&
                            GAME_TABLE[1][1] == GAME_TABLE[0][2] &&
                            GAME_TABLE[1][1] == COMPUTER) {
                        isComputerWinner = true;
                    } else {
                        isComputerWinner = false;
                    }
                }
            }
            if (isComputerWinner) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            isDraw = true;
            exit:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (GAME_TABLE[i][j] == EMPTY) {
                        isDraw = false;
                        break exit;
                    }
                }
            }
            if (isDraw) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("----");
            }
            System.out.println("-");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + GAME_TABLE[i][j] + " ");
                if (j == 2) {
                    System.out.println("|");
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("----");
        }
        System.out.println("-");
        System.out.println("GAME OVER!");
    }
}
