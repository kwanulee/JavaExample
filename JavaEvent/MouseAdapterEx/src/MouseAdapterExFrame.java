import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExFrame extends JFrame{
    JLabel la = new JLabel("Hello");

    MouseAdapterExFrame() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());

        c.setLayout(null);
        la.setSize(50, 20); // 레이블의 크기 50x20 설정
        la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
        c.add(la);

        setSize(200, 200);
        setVisible(true);

    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX(); // 마우스의 클릭 좌표 x
            int y = e.getY(); // 마우스의 클릭 좌표 y
            la.setLocation(x, y); // (x,y) 위치로 레이블 이동
        }
    }

    public static void main(String [] args) {
        new MouseAdapterExFrame();
    }

}


