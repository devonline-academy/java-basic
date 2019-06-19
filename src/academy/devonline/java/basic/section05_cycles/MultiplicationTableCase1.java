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

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print((i == 1 ? "" : i) + "\t");
        }
        System.out.println();

        for (int i = 2; i < 10; i++) {
            System.out.print(i + "\t");
            for (int j = 2; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
