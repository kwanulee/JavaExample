import javax.swing.*;
import java.awt.*;

public class EventListenerTest extends JFrame {
    EventListenerTest() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(250, 120);
        setVisible(true);

    }
    public static void main(String[] args) {
        new EventListenerTest();
    }
}

