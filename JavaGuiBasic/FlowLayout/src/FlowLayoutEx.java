import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new FlowLayoutPanel());

        setSize(300, 200); // 프레임 크기 300x200 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}

class FlowLayoutPanel extends JPanel {
    FlowLayoutPanel() {
        // 왼쪽 정렬로, 수평 간격을 30, 수직 간격을 40 픽셀로 배치하는
        // FlowLayout 생성
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        add(new JButton("add"));
        add(new JButton("sub"));
        add(new JButton("mul"));
        add(new JButton("div"));
        add(new JButton("Calculate"));
    }
}
