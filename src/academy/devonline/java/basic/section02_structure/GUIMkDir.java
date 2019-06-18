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

package academy.devonline.java.basic.section02_structure;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class GUIMkDir extends JFrame {

    private GUIMkDir() {
        setTitle("mkdir");
        setLayout(new FlowLayout());
        setSize(400, 200);
        JTextField tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(200, 30));
        add(tfName);
        JButton btMkDir = new JButton("Make directory");
        btMkDir.addActionListener(e -> new File(tfName.getText()).mkdir());
        add(btMkDir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new GUIMkDir().setVisible(true));
    }
}
