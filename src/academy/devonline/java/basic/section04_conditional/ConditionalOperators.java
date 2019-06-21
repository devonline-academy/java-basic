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

package academy.devonline.java.basic.section04_conditional;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class ConditionalOperators {
    public static void main(String[] args) {
        var day = 1;

        // if else
        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Workday");
        }

        // Ternary
        System.out.println(day == 6 || day == 7 ? "Weekend" : "Workday");

        // Switch
        switch (day) {
            case 6:
            case 7: {
                System.out.println("Weekend");
                break;
            }
            default: {
                System.out.println("Workday");
            }
        }

        var month = 4;

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Unsupported month number: " + month);
        }
    }
}
