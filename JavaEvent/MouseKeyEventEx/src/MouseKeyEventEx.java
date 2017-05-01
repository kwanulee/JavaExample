import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseKeyEventEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello 텍스트 추가/삭제하기");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new ContentPane();
        frame.setContentPane(contentPane);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}

class ContentPane extends JPanel {
    int count = 1;

    ContentPane() {
        setBackground(Color.WHITE);
        setLayout(null);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JLabel label = new JLabel(Integer.toString(count++));
                label.setBounds(e.getX(), e.getY(), 20, 20);
                add(label);
                label.addMouseListener(new MyMouseListener());
                label.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyChar() == 'd') {
                            remove((JLabel) e.getSource());
                    
                            revalidate();
                            repaint();
                        }
                    }
                });
                revalidate();
            }
        });
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            JLabel la = (JLabel) e.getSource();
            la.setOpaque(true);
            la.setBackground(Color.BLUE);
            la.requestFocus();
        }

        public void mouseExited(MouseEvent e) {
            JLabel la = (JLabel) e.getSource();
            la.setOpaque(true);
            la.setBackground(Color.WHITE);
        }
    }
}
