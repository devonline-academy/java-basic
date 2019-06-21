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
public class Switch {
    public static void main(String[] args) {
        var a = 3;

        switch (a) {
            case 1: {
                System.out.println("1");
            }
            case 2: {
                System.out.println("2");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }

        //
        //Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
        //1,   2,   3,   4,   5,   6,   7,   8,   9,   10,  11,  12
        var month = 4;

        switch (month) {
            case 1:
            case 2:
            case 12: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default: {
                System.out.println("Unsupported month number: " + month);
            }
        }
    }
}
