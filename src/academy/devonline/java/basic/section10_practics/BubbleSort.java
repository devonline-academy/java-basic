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

package academy.devonline.java.basic.section10_practics;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class BubbleSort {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 1, 4, 2, 8};
        // processing
        bubbleSort(array);
        // display results
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
