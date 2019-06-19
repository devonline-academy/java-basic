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

package academy.devonline.java.basic.section03_expression;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;
        var d = 2 == 1;

        System.out.println(!a);
        System.out.println(!b);

        System.out.println(a && b);
        System.out.println(a || b);

        //-----------------------------------------
        {
            System.out.println("--------------- && ---------------");
            System.out.println("true \t && \t true \t = \t" + (true && true));
            System.out.println("true \t && \t false \t = \t" + (true && false));
            System.out.println("false \t && \t true \t = \t" + (false && true));
            System.out.println("false \t && \t false \t = \t" + (false && false));
        }
        {
            System.out.println("--------------- || ---------------");
            System.out.println("true \t || \t true \t = \t" + (true || true));
            System.out.println("true \t || \t false \t = \t" + (true || false));
            System.out.println("false \t || \t true \t = \t" + (false || true));
            System.out.println("false \t || \t false \t = \t" + (false || false));
        }
    }
}
