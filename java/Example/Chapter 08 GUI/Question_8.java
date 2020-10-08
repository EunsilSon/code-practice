/*
* 애플리케이션을 외관만 작성하여라
* */

package GUI;

import javax.swing.*;

public class Question_8 extends JFrame {
    public Question_8() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("자바는 재미있나요?");
        JButton button1 = new JButton("YES");
        JButton button2 = new JButton("NO");

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        add(panel);

        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_8();
    }
}
