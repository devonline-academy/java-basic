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
public class LeapYear {
    public static void main(String[] args) {
        var year = 2019;

        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
