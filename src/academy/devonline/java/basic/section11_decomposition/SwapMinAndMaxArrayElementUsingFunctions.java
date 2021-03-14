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

package academy.devonline.java.basic.section11_decomposition;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class SwapMinAndMaxArrayElementUsingFunctions {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 3, 8, 5};

        // processing
        var indexes = getIndexesOfMinAndMaxElements(array);
        swap(array, indexes[0], indexes[1]);

        // display results
        System.out.println(Arrays.toString(array));
    }

    private static int[] getIndexesOfMinAndMaxElements(int[] array) {
        var indexOfMinElement = 0;
        var minValue = array[0];
        var indexOfMaxElement = 0;
        var maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;
            }
        }
        return new int[]{indexOfMinElement, indexOfMaxElement};
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
