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

package academy.devonline.java.basic.section07_String;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class MathHelper {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            String cmd = new Scanner(System.in).nextLine();
            if ("exit".equals(cmd) || "quit".equals(cmd)) {
                break;
            } else if ("pi".equals(cmd)) {
                System.out.println(Math.PI);
            } else if ("e".equals(cmd)) {
                System.out.println(Math.E);
            } else {
                System.out.println("Invalid cmd. Try again!");
            }
        }
    }
}
