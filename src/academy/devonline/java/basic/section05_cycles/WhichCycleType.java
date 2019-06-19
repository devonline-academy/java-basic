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

package academy.devonline.java.basic.section05_cycles;

import java.util.Iterator;
import java.util.List;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class WhichCycleType {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while
        int j = 0;
        while (j < 4) {
            System.out.print(j++ + " ");
        }
        System.out.println();

        //do while
        int k = 0;
        do {
            System.out.print(k++ + " ");
        } while (k < 4);
        System.out.println();

        // Which ??????????????????

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = List.of(1, 2, 3, 4).iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //do while
    }
}
