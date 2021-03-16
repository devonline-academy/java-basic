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
public class PrintArrayElementsMoreThanAvgVersion3 {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 4, -5, -2, 0, 12};

        // processing
        int[] result = subArrayWithMoreThanAvgElements(array);

        // display results
        System.out.println(Arrays.toString(result));
    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        double sum = getSum(array);
        int avg = getAvg(array, sum);
        return extractElementsMoreThanAvg(array, avg);
    }

    private static int[] extractElementsMoreThanAvg(int[] array, int avg){
        int[] temp = new int[array.length];
        int index = 0;
        for (int value : array) {
            if (value > avg) {
                temp[index++] = value;
            }
        }
        return trim(temp, index);
    }

    private static int[] trim(int[] temp, int index) {
        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    private static int getAvg(int[] array, double sum) {
        double avg = sum / array.length;
        int avgInt = (int) avg;
        if (avg - avgInt >= 0.5) {
            avgInt++;
        }
        return avgInt;
    }

    private static double getSum(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
