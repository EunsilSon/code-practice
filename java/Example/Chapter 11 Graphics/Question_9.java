/*
 SkyScraper이라는 클래스를 작성하라.
 SkyScraper 클래스의 생성자에서는 위치, 높이, 너비, 색상을 받아서 지정된 위치에 직사각형을 그린다.
 SkyScraper 객체를 랜덤한 위치에 여러 개 생성하여서 그려보라.
 */

package Graphics;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;

public class Question_9 extends JFrame { // 프레임 생성
    public Question_9() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SkyScraper");
        add(new SkyScraper());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_9();
    }
}

class SkyScraper extends JPanel {
    ArrayList<Shape> shapeArray = new ArrayList<>();

    public SkyScraper() {
        // x, y, w, h를 랜덤 값으로 지정해 shapeArray에 한 개씩 저장
        for (int i = 0; i < 10; i++) {
            shapeArray.add(new Rectangle2D.Float((int) (Math.random() * 400), (int) (Math.random() * 400), (int) (Math.random() * 400), (int) (Math.random() * 400)));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // shapeArray에 있는 Shape 객체를 한 개씩 꺼내옴
        for (Shape s : shapeArray) {
            g2.setColor(new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0)));
            g2.fill(s);
        }
    }
}