import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingTextEx {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new ContentPane();
        frame.setContentPane(contentPane);

        frame.setSize(200, 200);
        frame.setVisible(true);
        contentPane.requestFocus();
    }
}
class ContentPane extends JPanel {
    JLabel la = new JLabel("HELLO");

    ContentPane() {
        setLayout(null);
        la.setLocation(50, 50);
        la.setSize(50, 20);
        add(la);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode(); // 입력된 키코드
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        la.setLocation(la.getX(), la.getY() - 10);
                        break;
                    case KeyEvent.VK_DOWN:
                        la.setLocation(la.getX(), la.getY() + 10);
                        break;
                    case KeyEvent.VK_LEFT:
                        la.setLocation(la.getX() - 10, la.getY());
                        break;
                    case KeyEvent.VK_RIGHT:
                        la.setLocation(la.getX() + 10, la.getY());
                        break;
                }
            }
        });
    }
}