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

import java.math.BigInteger;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class IntOverflow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println(i + 1);
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(i - 1);
        }

        System.out.println(1);
        System.out.println(1 * 2);
        System.out.println(1 * 2 * 3);
        System.out.println(1 * 2 * 3 * 4);
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13);

        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 2);

        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14);

        long g;//8 bytes
        BigInteger b = new BigInteger("");//Infinite size
    }
}
