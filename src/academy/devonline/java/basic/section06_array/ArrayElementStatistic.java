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

package academy.devonline.java.basic.section06_array;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class ArrayElementStatistic {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        // processing
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            var element = array[i];

            var exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                var number = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (element == array[j]) {
                        number++;
                    }
                }

                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }

        // display results
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + " = " + ((double) counts[i] * 100 / array.length) + " %");
        }
    }
}
