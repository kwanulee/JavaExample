import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx {
    public static void main(String [] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Mouse 이벤트 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new LabelPanel());
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

class LabelPanel extends JPanel {
    JLabel la = new JLabel("Hello");

    LabelPanel() {
        addMouseListener(new MyMouseListener());
        setLayout(null);
        la.setSize(50, 20); // 레이블의 크기 50x20 설정
        la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
        add(la);
    }

    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            int x = e.getX(); // 마우스의 클릭 좌표 x
            int y = e.getY(); // 마우스의 클릭 좌표 y
            la.setLocation(x, y); // (x,y) 위치로 레이블 이동
        }
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
}


