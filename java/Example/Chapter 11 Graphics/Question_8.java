/*
  원을 나타내는 Circle 클래스를 작성한다.
  Circle 클래스의 생성자에서는 색상, 반지름, 중심를 매개 변수로 받아서 원을 그린다.
  Circle 객체를 여러 개 생성하여서 화면의 랜덤한 위치에 원이 여러 개 나타나도록 하라.
 */

package Graphics;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Question_8 extends JFrame { // 프레임 생성
    public Question_8() {
        setSize(1000, 300);
        setTitle("원 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CirclePanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_8();
    }
}

class Circle{ // 원 그리기에 필요한 각종 변수 값 지정
    int x, y, w, h, rad;
    Color color;

    public Circle(int x, int y, int rad, Color color) {
        this.x = x;
        this.y = y;
        this.rad = rad;
        this.w = rad * 2;
        this.h = rad * 2;
        this.color = color;
    }
}

class CirclePanel extends JPanel { // 원 그리기
    ArrayList<Circle> cList = new ArrayList<>();

    public CirclePanel(){
        for (int i = 0; i < 10; i++) {
            // 반지름, 크기, 색상 랜덤 지정
            int rad = (int)((Math.random() * 100) + 10);
            int x = (int)(Math.random() * 1000 - (rad * 2));
            int y = (int)(Math.random() * 300 - (rad * 2));
            Color color = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));

            // 프레임 밖으로 나가지 않도록 크기는 0보다 큰 것만 해당
            if(x < 0)
                x = 0;
            if(y < 0)
                y = 0;

            cList.add(new Circle(x, y, rad, color));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // 앤티 에일리어싱 설정
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(3));

        // 순차리스트 cList에 있는 Circle 객체를 한 개씩 꺼내옴
        for(Circle c : cList){
            g2.setColor(c.color);
            g2.drawOval(c.x, c.y, c.w, c.h);
            g2.drawString("r=" + c.rad, c.x + c.rad, c.y + c.rad);
        }
    }
}