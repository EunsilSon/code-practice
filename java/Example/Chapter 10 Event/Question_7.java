/*
* 버튼을 누르면 마일이 킬로미터로 변환되는 프로그램을 작성하라.
* */
package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MakeFrame extends JFrame {
    double m, km;
    JPanel MainPanel = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel label = new JLabel("거리를 마일 단위로 입력하시오");
    JButton button = new JButton("변환");
    JTextField Textfield = new JTextField(5);
    JTextField AnswerField = new JTextField(20);

    public MakeFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("마일을 킬로미터로 변환");

        AnswerField.setEnabled(false); // 결과 출력 용 텍스트 박스 사용 불가

        button.addActionListener((ActionEvent e) -> {
            // 텍스트 필드의 값을 실수형으로 변환
            String str = Textfield.getText();
            m = Double.parseDouble(str);

            km = m * 1.609344;
            AnswerField.setText(m + " 마일은 " + km + " 킬로미터 입니다.");
            });


        p1.add(label);
        p2.add(Textfield);
        p2.add(button);
        p3.add(AnswerField);
        MainPanel.add(p1);
        MainPanel.add(p2);
        MainPanel.add(p3);
        MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS)); // BoxLayout: 행 또는 열 방향으로 일렬 배치
        add(MainPanel);
        setVisible(true);
    }
}

public class Question_7 {
    public static void main(String[] args) {
        new MakeFrame();
    }
}