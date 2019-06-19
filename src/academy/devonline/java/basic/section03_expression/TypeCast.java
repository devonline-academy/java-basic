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
 */
public class TypeCast {
    public static void main(String[] args) {
        // int, double, boolean, char, String

        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a');

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(1);
        System.out.println(ch2);
        //
        char ch = 2;
        int i = 4;
        double d = 8;

        d = i;
        d = ch;
        i = ch;

        i = (int) d;
        ch = (char) d;
        ch = (char) i;

        boolean b = true;
    }
}
