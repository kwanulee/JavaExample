import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListenerTest extends JFrame {
    JButton btn;

    EventListenerTest() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(250, 120);
        setVisible(true);

    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (btn.getText().equals("Action"))
                btn.setText("액션");
            else
                btn.setText("Action");
            setTitle(btn.getText()); // 프레임 타이틀에 버튼문자열 출력
        }
    }

    public static void main(String[] args) {
        new EventListenerTest();
    }
}

