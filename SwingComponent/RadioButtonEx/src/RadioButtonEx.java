import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonEx extends JFrame {
    private RadioButtonEx() {
        setTitle("라디오버튼 만들기 예제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성

        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리");

        // 버튼 그룹에 3개의 라디오버튼 삽입
        g.add(apple);
        g.add(pear);
        g.add(cherry);

        // 컨텐트팬에 3개의 라디오버튼 삽입
        c.add(apple); c.add(pear); c.add(cherry);
        setSize(250,150);
        setVisible(true);

        MyItemListener iListener = new MyItemListener();
        apple.addItemListener(iListener);
        pear.addItemListener(iListener);
        cherry.addItemListener(iListener);

        MyActionListener aListener = new MyActionListener();
        apple.addActionListener(aListener);
        pear.addActionListener(aListener);
        cherry.addActionListener(aListener);

    }

    // Item 리스너 구현
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("[ActionEvent]:"
                    +e.getActionCommand() + " Pressed");

        }
    }

    class MyItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            JRadioButton btn = (JRadioButton)e.getItem();
            if (e.getStateChange() == ItemEvent.SELECTED)
                System.out.println("[ItemEvent]:"
                        +btn.getText() + " Selected");
            else if (e.getStateChange() ==
                    ItemEvent.DESELECTED)
                System.out.println("[ItemEvent]:"
                        +btn.getText() + " Deselected");
        }

    }

    public static void main(String [] args) {
        new RadioButtonEx();
    }
}
