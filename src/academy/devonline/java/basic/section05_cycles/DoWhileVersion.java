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
public class DoWhileVersion {
    public static void main(String[] args) {
        // DisplayNumbersFrom100To1-------------------------------------------------------
        {
            // read source data
            var from = 100;
            var to = 1;
            var step = 1;

            // display results
            int i = from;
            do {
                System.out.print(i + " ");
                i -= step;
            } while (i >= to);
            System.out.println();
        }
        // DisplayEvenNumbersFrom0To50----------------------------------------------------
        {
            // read source data
            var from = 0;
            var to = 50;
            var step = 2;

            // display results
            var i = from;
            do {
                System.out.print(i + " ");
                i += step;
            } while (i <= to);
            System.out.println();
        }
    }
}
