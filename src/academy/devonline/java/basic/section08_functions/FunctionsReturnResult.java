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

package academy.devonline.java.basic.section08_functions;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class FunctionsReturnResult {

    private static int function01() {
        return 2 + 4;
    }

    private static int function02() {
        if (2 > 3) {
            return 2;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                return 8;
            }
        }
        return function01();
    }

    private static void function03() {
        // sout current date
    }

    private static void function04() {
        int a = 0;
        if (a > 2) {
            return;
        }
        // do something
    }

    public static void main(String[] args) {
        function03();
        function04();

        function01();
        function02();

        System.out.println(function01());
        System.out.println(function02());

        int a = function01();
        if (a > 0) {
            // do something
        }
        int b = function02();
        int c = b + function01();

        if (function01() > 0) {
            // do something
        }
        if (function02() % 12 < 0) {
            // do something
        }
    }
}
