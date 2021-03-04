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

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class StringBuilderUsage {

    public static void main(String[] args) {
        String s = "hello";

        StringBuilder builder = new StringBuilder();
        builder.append("world");
        builder.insert(0, "hello");
        builder.insert(5, ' ');

        String result = builder.toString();
        System.out.println(result);

        builder.deleteCharAt(0);

        System.out.println(builder.toString());

        builder.setLength(0);
        //builder.delete(0, builder.length());

        System.out.println(builder.toString());

        System.out.println("qwerty");
    }
}
