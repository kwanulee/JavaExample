import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BorderLayoutPanel());

        setSize(300, 200); // 프레임 크기 300x200 설정
        setVisible(true); // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}

class BorderLayoutPanel extends JPanel {
    BorderLayoutPanel() {
        // 컨텐트팬에 BorderLayout 배치관리자 설정
        setLayout(new BorderLayout(30, 20));
        add(new JButton("Calculate"), BorderLayout.CENTER);
        add(new JButton("add"), BorderLayout.NORTH);
        add(new JButton("sub"), BorderLayout.SOUTH);
        add(new JButton("mul"), BorderLayout.EAST);
        add(new JButton("div"), BorderLayout.WEST);
    }
}

