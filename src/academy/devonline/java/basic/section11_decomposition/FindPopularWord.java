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
public class FindPopularWord {
    public static void main(String[] args) {
        // read source data
        String text = "hello,java-world\tjava    hello: I? Hello! Java World. java";
        // processing
        String word = findMostPopularWordInText(text);
        // display results
        System.out.println(word);
    }

    private static String findMostPopularWordInText(String text) {
        String[] words = findAllWordsInText(text);
        String[][] uniqueWordsAndCounts = findUniqueWordsAndCounts(words);
        return getWordWithMaxCount(uniqueWordsAndCounts);
    }

    private static String[] findAllWordsInText(String text) {
        //return text.split(" ");
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
        return Arrays.copyOf(result, index);
    }

    private static String[][] findUniqueWordsAndCounts(String[] words) {
        String[] uniqueWords = new String[words.length];
        String[] counts = new String[words.length];
        int count = 0;
        for (String word : words) {
            var lowerCaseWord = word.toLowerCase();
            if (!isAlreadyProcessed(uniqueWords, lowerCaseWord, count)) {
                int total = calculateWords(words, lowerCaseWord);
                uniqueWords[count] = lowerCaseWord;
                counts[count] = String.valueOf(total);
                count++;
            }
        }
        return convertResults(uniqueWords, counts, count);
    }

    private static boolean isAlreadyProcessed(String[] uniqueWords, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (uniqueWords[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static int calculateWords(String[] words, String word) {
        int count = 0;
        for (String w : words) {
            if (word.equalsIgnoreCase(w)) {
                count++;
            }
        }
        return count;
    }


    private static String[][] convertResults(String[] uniqueWords, String[] counts, int count) {
        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = uniqueWords[i];
            result[i][1] = counts[i];
        }
        return result;
    }

    private static String getWordWithMaxCount(String[][] uniqueWordsAndCounts) {
        String word = uniqueWordsAndCounts[0][0];
        int maxCount = Integer.parseInt(uniqueWordsAndCounts[0][1]);
        for (int i = 1; i < uniqueWordsAndCounts.length; i++) {
            int currentCount = Integer.parseInt(uniqueWordsAndCounts[i][1]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                word = uniqueWordsAndCounts[i][0];
            }
        }
        return word;
    }

}
