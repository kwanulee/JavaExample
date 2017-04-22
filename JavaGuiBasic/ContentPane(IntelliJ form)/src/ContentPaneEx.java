import javax.swing.*;
import java.awt.*;

/**
 * Created by kwanwoo on 2017. 4. 22..
 */
public class ContentPaneEx extends JFrame {
    private JPanel contentPane;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    ContentPaneEx() {
        setTitle("ContentPane과 JFrmae 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // contentPane.setBackground(Color.ORANGE);
        setContentPane(contentPane);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }

}
