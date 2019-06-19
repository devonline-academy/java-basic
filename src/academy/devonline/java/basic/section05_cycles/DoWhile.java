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

package academy.devonline.java.basic.section05_cycles;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class DoWhile {
    public static void main(String[] args) {
        {
            var i = 100;
            while (i >= 1) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }

        {
            var i = 100;
            do {
                System.out.print(i-- + " ");
            } while (i >= 1);
            System.out.println();
        }

        // Important -------------------------------------------

        int n = -1;
        // for
        for (int i = 0; i < n; i++) {
            System.out.println("for -> " + i);
        }
        // while
        {
            int i = 0;
            while (i < n) {
                System.out.println("while -> " + i++);
            }
        }
        // do while
        {
            int i = 0;
            do {
                System.out.println("do while -> " + i++);
            } while (i < n);
        }
    }
}
