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
public class ReverseStringBadExample {

    public static void main(String[] args) {
        // read source data
        String s = "Hello world!";

        // processing
        String res = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            // Use StringBuilder instead!
            res = res + s.charAt(i);
        }

        // display results
        System.out.println(res);
    }
}
