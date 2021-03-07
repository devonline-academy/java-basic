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
public class RecursionAlgorithmExampleVersion2 {
    public static void main(String[] args) {
        printNumbersFromAndTo10(1);
        printNumbersFrom1AndTo(100);
    }

    private static void printNumbersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumbersFromAndTo10(i + 1);
        }
    }

    private static void printNumbersFrom1AndTo(int i) {
        printNumbersFrom1AndTo(i, i);
    }

    private static void printNumbersFrom1AndTo(int i, int to) {
        if (i != 0) {
            printNumbersFrom1AndTo(i - 1, to);
            System.out.print(i + "\t");
            if (i == to) {
                System.out.println();
            }
        }
    }
}
