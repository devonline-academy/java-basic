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

package academy.devonline.java.basic.section09_recursion;

import java.io.File;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class FindFile {
    public static void main(String[] args) {
        String dir = "C:\\Users\\devonline\\IdeaProjects\\java-basic";
        String query = "FindFile.java";

        findFile(new File(dir), query);
    }

    private static void findFile(File dir, String fileName) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, fileName);
            } else if (file.isFile()) {
                if (fileName.equals(file.getName())) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
