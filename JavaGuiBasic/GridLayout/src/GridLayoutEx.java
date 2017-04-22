import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GridLayoutPanel());
        setSize(500, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}

class GridLayoutPanel extends JPanel {
    GridLayoutPanel() {
        // 1x10의 GridLayout 배치관리자
        setLayout(new GridLayout(1, 10));

        for(int i=0; i<10; i++) { // 10개의 버튼 부착
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text);
            add(button); // 컨텐트팬에 버튼 부착
        }
    }
}
