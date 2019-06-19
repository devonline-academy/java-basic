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
public class UniversalWeekDay {
    public static void main(String[] args) {
        var day = 7;
        var isMondayFirst = true;

        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }

        if (internalDay == 1) {
            System.out.println("Monday");
        } else if (internalDay == 2) {
            System.out.println("Tuesday");
        } else if (internalDay == 3) {
            System.out.println("Wednesday");
        } else if (internalDay == 4) {
            System.out.println("Thursday");
        } else if (internalDay == 5) {
            System.out.println("Friday");
        } else if (internalDay == 6) {
            System.out.println("Saturday");
        } else if (internalDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day: " + day);
        }
    }
}
