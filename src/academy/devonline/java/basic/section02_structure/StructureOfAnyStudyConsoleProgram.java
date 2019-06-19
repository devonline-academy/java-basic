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

package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class StructureOfAnyStudyConsoleProgram {
    public static void main(String[] args) {
        var a = 8;//new Scanner(System.in).nextInt();
        var b = 9;//new Scanner(System.in).nextInt();

        var result = a + b * ((5 - 7) * a);

        System.out.println(result);
    }
}