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

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class BinarySearchIterative {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 10;
        // processing
        int index = binarySearchIterative(array, query);
        // display results
        System.out.println("Index=" + index);
    }

    private static int binarySearchIterative(int[] array, int query) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = array[middleIndex];
            if (query > middleValue) {
                startIndex = middleIndex + 1;
            } else if (query < middleValue) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

}
