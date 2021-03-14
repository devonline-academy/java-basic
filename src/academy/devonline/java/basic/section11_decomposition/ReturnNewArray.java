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

package academy.devonline.java.basic.section11_decomposition;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class ReturnNewArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNewArray1()));
        System.out.println(Arrays.toString(getNewArray2()));
        System.out.println(Arrays.toString(getNewArray3()));
    }

    private static int[] getNewArray1() {
        int[] ar = {1, 2, 3};
        return ar;
    }

    private static int[] getNewArray2() {
        int[] ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        return ar;
    }

    private static int[] getNewArray3() {
        return new int[]{1, 2, 3};
    }
}
