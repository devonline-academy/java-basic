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
public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {
        {
            var day = 1;
            System.out.println(
                    day == 1 ? "Monday" :
                            day == 2 ? "Tuesday" :
                                    day == 3 ? "Wednesday" :
                                            day == 4 ? "Thursday" :
                                                    day == 5 ? "Friday" :
                                                            day == 6 ? "Saturday" :
                                                                    day == 7 ? "Sunday" :
                                                                            "Invalid day: " + day);
        }
        {
            var day = 7;
            var isMondayFirst = true;

            System.out.println(
                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 1 ? "Monday" :
                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 2 ? "Tuesday" :
                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 3 ? "Wednesday" :
                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 4 ? "Thursday" :
                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 5 ? "Friday" :
                                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 6 ? "Saturday" :
                                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 7 ? "Sunday" :
                                                                            "Invalid day: " + day);
        }
    }
}
