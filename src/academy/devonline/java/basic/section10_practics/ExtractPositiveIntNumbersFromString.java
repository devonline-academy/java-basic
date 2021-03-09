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
public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
        // display results
        System.out.println(Arrays.toString(numbers));
    }

    // 22222222
    // 2,2,2,2
    private static int[] extractNumbersFromString(final String string) {
        int[] results = new int[string.length() / 2 + 1];
        int count = 0;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (isDigit(ch)) {
                numberBuilder.append(ch);
            } else if (numberBuilder.length() > 0) {
                results[count++] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
            }
        }
        if (numberBuilder.length() > 0) {
            results[count++] = Integer.parseInt(numberBuilder.toString());
        }
        return trimArray(results, count);
    }

    private static boolean isDigit(char ch) {
        // return Character.isDigit(ch);
        return ch >= '0' && ch <= '9';
    }

    private static int[] trimArray(int[] array, int count) {
        int[] result = new int[count];
        //System.arraycopy(array, 0, result, 0, count);
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
