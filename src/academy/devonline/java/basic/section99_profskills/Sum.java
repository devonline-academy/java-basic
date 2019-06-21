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
public class Sum {
    public static void main(final String[] args) {
        long[] values = {100, 1_000, 1_000_000, Integer.MAX_VALUE};

        for (final long n : values) {
            System.out.println(n + ": ----------------------");
            long time = System.nanoTime();

            long sum = 0;
            for (long i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum + " -> " + (double) (System.nanoTime() - time) / 1_000_000_000 + " seconds");

            //---------------------------------------------------------------------
            time = System.nanoTime();
            long sum2 = (1L + n) * n / 2L;
            System.out.println(sum2 + " -> " + (double) (System.nanoTime() - time) / 1_000_000_000 + " seconds");
        }
    }
}
