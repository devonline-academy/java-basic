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
public class PrintArrayElementsMoreThanAvgVersion2 {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12};

        int[] result = subArrayWithMoreThanAvgElements(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        int avg = calculateAvg(array);
        return extractElementsMoreThanAvg(array, avg);
    }

    private static int calculateAvg(int[] array) {
        double sum = getSum(array);
        double result = sum / array.length;
        return (int)Math.round(result);
    }

    private static double getSum(int[] array) {
        double sum = 0.;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static int[] extractElementsMoreThanAvg(int[] array, int avg) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > avg) {
                result[count++] = value;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
