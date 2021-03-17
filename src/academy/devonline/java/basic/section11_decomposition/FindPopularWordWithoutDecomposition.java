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
public class FindPopularWordWithoutDecomposition {
    public static void main(String[] args) {
        // read source data
        String text = "hello,java-world\tjava    hello: I? Hello! Java World. java";
        // processing
        String[] result = new String[text.length()];
        int index = 0;

        StringBuilder wordBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            var ch = text.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                wordBuilder.append(ch);
            } else if (wordBuilder.length() > 0) {
                result[index++] = wordBuilder.toString();
                wordBuilder.setLength(0);
            }
        }
        if (wordBuilder.length() > 0) {
            result[index++] = wordBuilder.toString();
        }
        String[] words = Arrays.copyOf(result, index);
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int count = 0;
        for (String word : words) {
            var lowerCaseWord = word.toLowerCase();
            boolean alreadyProcessed = false;
            for (int i = 0; i < count; i++) {
                if (uniqueWords[i].equals(word)) {
                    alreadyProcessed = true;
                    break;
                }
            }
            if (!alreadyProcessed) {
                int total = 0;
                for (String w : words) {
                    if (lowerCaseWord.equalsIgnoreCase(w)) {
                        total++;
                    }
                }
                uniqueWords[count] = lowerCaseWord;
                counts[count] = total;
                count++;
            }
        }
        String word = uniqueWords[0];
        int maxCount = counts[0];
        for (int i = 1; i < uniqueWords.length; i++) {
            int currentCount = counts[i];
            if (currentCount > maxCount) {
                maxCount = currentCount;
                word = uniqueWords[i];
            }
        }
        // display results
        System.out.println(word);
    }
}
