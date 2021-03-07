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

package academy.devonline.java.basic.section09_recursion;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class RecursionAlgorithmExample {
    public static void main(String[] args) {
        printNumbersFrom1To10();
        printNumbersFromAndTo10(1);
    }

    /*private static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }*/

    private static void printNumbersFrom1To10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                System.out.println();
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
    }

    private static void printNumbersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else{
            System.out.print(i + "\t");
            printNumbersFromAndTo10(i + 1);
        }
    }
}
