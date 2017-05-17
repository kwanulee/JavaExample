import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame {
    private OptionPaneEx() {
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        setSize(500,200);
        contentPane.add(new MyPanel(),
                BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String [] args) {
        new OptionPaneEx();
    }

    class MyPanel extends Panel {
        JButton inputBtn = new JButton("Input Name");
        JTextField tf = new JTextField(10);
        JButton confirmBtn = new JButton("Confirm");
        JButton messageBtn = new JButton("Message");

        MyPanel() {
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);
            inputBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name =
                            JOptionPane.showInputDialog("이름을 입력하세요.");
                    if(name != null)
                        tf.setText(name);
                }
            });

            confirmBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(getParent(),
                            "계속할 것입니까?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.CLOSED_OPTION)
                        tf.setText("Just Closed without Selection");
                    else if(result == JOptionPane.YES_OPTION)
                        tf.setText("Yes");
                    else
                        tf.setText("No");
                }
            });

            messageBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(getParent(),
                            "조심하세요", "Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

}
