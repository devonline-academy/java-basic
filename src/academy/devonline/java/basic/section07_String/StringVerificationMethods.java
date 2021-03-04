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

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world world!";

        System.out.println("s.contains(\"world\")=" + s.contains("world"));
        System.out.println("s.contains(\"World\")=" + s.contains("World"));

        System.out.println("s.indexOf('o')=" + s.indexOf('o'));
        System.out.println("s.lastIndexOf('o')=" + s.lastIndexOf('o'));

        System.out.println("s.indexOf(\"world\")=" + s.indexOf("world"));
        System.out.println("s.lastIndexOf(\"world\")=" + s.lastIndexOf("world"));

        System.out.println("s.startsWith(\"Hello\")=" + s.startsWith("Hello"));
        System.out.println("s.endsWith(\"world\")=" + s.endsWith("world"));

        System.out.println("s.isEmpty()=" + s.isEmpty());

        System.out.println("".isEmpty());
    }
}
