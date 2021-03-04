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

package academy.devonline.java.basic.section07_String;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class StringNewStringMethods {

    public static void main(String[] args) {
        String s = " Hello world! ";

        System.out.println("s.toUpperCase()=" + s.toUpperCase());
        System.out.println("s.toLowerCase()=" + s.toLowerCase());

        System.out.println("s.repeat(2)=" + s.repeat(2));

        s = s.repeat(2);

        System.out.println("s.replace('l', 'j')=" + s.replace('l', 'j'));
        System.out.println("s.replace(\"Hello\", \"Bye\")=" + s.replace("Hello", "Bye"));

        System.out.println("s.substring(6)=" + s.substring(6));
        System.out.println("s.substring(0, 6)=" + s.substring(0, 6));

        System.out.println("s.split(\" \")=" + Arrays.toString(s.split(" ")));

        System.out.println("s.trim()=" + s.trim());
        System.out.println("s.strip()=" + s.strip());
    }
}
