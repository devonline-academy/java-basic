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

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class IfElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        if (a > b) {
            var result = "a > b";
            System.out.println(result);
        }
        //
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }
        //
        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
        }
        System.out.println("after");

        //
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        //
        boolean condition = a > b;
        if (condition) {
            System.out.println("condition=true");
        }

        //
        if (condition || a < b && a > 1 || !(b < 7)) {
            System.out.println("Complex condition example");
        }
    }
}
