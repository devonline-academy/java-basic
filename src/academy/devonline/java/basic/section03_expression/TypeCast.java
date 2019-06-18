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
        // String, int, double, boolean, char
        {
            //toString
            String is = String.valueOf(1);
            String ds = String.valueOf(1.1);
            String bs = String.valueOf(true);
            String cs = String.valueOf('a');

            //fromString
            int si = Integer.parseInt("1");
            double sd = Double.parseDouble("1.1");
            boolean sb = Boolean.parseBoolean("true");
            char sc = "a".charAt(0);
        }
        //----------------------------------------
        {
            //toInt
            int di = (int)1.1;
            int si = Integer.parseInt("1");
            /*! boolean -> int */
            int ci = 'a';
            //fromInt
            String is = String.valueOf(1);
            double id = 1;
            /*! int -> boolean */
            char ic = (char)97;
        }
        //----------------------------------------
        {
            //toDouble
            double id = 1;
            double sd = Double.parseDouble("1.1");
            /*! boolean -> double */
            double ci = 'a';//! nonsense
            //fromDouble
            String ds = String.valueOf(1.1);
            int di = (int)1.1;
            /*! double -> boolean */
            char dc = (char)97.0;//! nonsense
        }
        //----------------------------------------
        {
            //toBoolean
            boolean sb = Boolean.parseBoolean("true");
            //fromBoolean
            String bs = String.valueOf(true);
        }
        //----------------------------------------
        {
            //toChar
            char ic = (char)97;
            char dc = (char)97.0;//! nonsense
            /*! boolean -> char */
            char sc = "a".charAt(0);
            //fromChar
            int ci = 'a';
            double cd = 'a';//! nonsense
            /*! char -> boolean */
            String cs = String.valueOf('a');
        }
    }
}
