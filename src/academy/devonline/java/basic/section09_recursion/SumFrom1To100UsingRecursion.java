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
public class SumFrom1To100UsingRecursion {

    public static void main(String[] args) {
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(10));
    }

    private static int sumOf(int current, int sum) {
        if (current > 10) {
            return sum;
        } else {
            var newSum = sum + current;
            return sumOf(current + 1, newSum);
        }
    }

    private static int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            var prevSum = sumOf(value - 1);
            return value + prevSum;
        }
    }
}
