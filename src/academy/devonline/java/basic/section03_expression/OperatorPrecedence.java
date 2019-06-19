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

package academy.devonline.java.basic.section03_expression;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 * @link https://introcs.cs.princeton.edu/java/11precedence/
 */
public class OperatorPrecedence {
    public static void main(String[] args) {
        var a = 4;
        var b = 2 + -4 * 5 - a++ / 4 + --a;

        a = 4;
        var c = 2 + ((-4) * 5) - ((a++) / 4) + (--a);

        System.out.println(b);
        System.out.println(c);

        System.out.println("Hello " + (1 + 1));
        System.out.println((1 + 1) + " Hello");
    }
}
