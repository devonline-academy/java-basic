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

package academy.devonline.java.basic.section08_functions;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class ArrayElementCountUsingFunction {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        // processing
        int count = getCount(array, element);

        // display results
        System.out.println(count);
    }

    private static int getCount(int[] array, int element) {
        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }
}
