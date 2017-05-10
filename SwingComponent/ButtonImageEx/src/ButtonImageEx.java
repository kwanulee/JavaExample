import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
    ButtonImageEx() {
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");

        JButton btn = new JButton("call~~", normalIcon);
        btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
        btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록

        c.add(btn);
        setSize(250,150);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ButtonImageEx();
    }
}
