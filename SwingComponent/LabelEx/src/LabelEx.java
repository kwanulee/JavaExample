import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    private LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JLabel textLabel = new JLabel("제임스 고슬링 입니더!",
                                                SwingConstants.LEFT);
        ImageIcon img = new ImageIcon("images/gosling.jpg");
        JLabel imageLabel = new JLabel(img,SwingConstants.RIGHT);

        ImageIcon icon = new ImageIcon("images/icon.gif");
        JLabel label = new JLabel("커피한잔 하실래예, 전화주이소",
                icon, SwingConstants.CENTER);

        c.add(textLabel,BorderLayout.NORTH);
        c.add(imageLabel);
        c.add(label,BorderLayout.SOUTH);
        setSize(400,500);
        setVisible(true);
    }
    public static void main(String [] args) {
        new LabelEx();
    }
}
