import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawOvalMouseEx extends JFrame {
    GraphicsDrawOvalMouseEx() {
        setTitle("마우스 드래깅으로 타원 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String [] args) {
        new GraphicsDrawOvalMouseEx();
    }

    // 타원을 그릴 패널 작성. 이 패널에 마우스 리스너 구현
    class MyPanel extends JPanel {
        Point start=null, end=null; // 마우스의 시작점과 끝점
        public MyPanel() {
            MyMouseListener listener = new MyMouseListener();

            // listener를 아래 두 리스너로 공통으로 등록해야 한다.
            addMouseListener(listener);
            addMouseMotionListener(listener);
        }
        class MyMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                start = e.getPoint();
            }
            public void mouseDragged(MouseEvent e) {
                end = e.getPoint();
                repaint(); // 패널의 그리기 요청 주목
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(start == null) // 타원이 만들어지지 않았음
                return;
            g.setColor(Color.BLUE); // 파란색 선택
            int x = Math.min(start.x, end.x);
            int y = Math.min(start.y, end.y);
            int width = Math.abs(start.x - end.x);
            int height = Math.abs(start.y - end.y);
            g.drawOval(x, y, width, height); // 타원 그리기
        }
    }
}
