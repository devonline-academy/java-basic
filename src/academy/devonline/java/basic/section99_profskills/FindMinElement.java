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

package academy.devonline.java.basic.section99_profskills;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class FindMinElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {0, -2, 3, -6, 8, -6, 0, 89, 9};

        // processing
        if (array.length == 0) {
            System.out.println("Min element not found, because array is empty!");
        } else {
            var min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            // display results
            System.out.println(min);
        }
    }
}
