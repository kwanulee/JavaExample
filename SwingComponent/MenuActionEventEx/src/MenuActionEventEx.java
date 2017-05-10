import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame {
    private JLabel imgLabel = new JLabel(); // 빈 레이블

    private MenuActionEventEx() {
        setTitle("Menu에 Action 리스너 만들기 예제");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250,200); setVisible(true);
    }

    private void createMenu() {
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
        JMenuItem [] menuItem = new JMenuItem [4];
        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
        JMenu screenMenu = new JMenu("Screen");

        MenuActionListener listener = new MenuActionListener();
        for(int i=0; i<menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb); // 메뉴바를 프레임에 부착
    }
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch(cmd) { // 메뉴 아이템의 종류 구분
                case "Load" :
                    if(imgLabel.getIcon() != null) return;
                    // 이미 로딩되었으면 리턴
                    imgLabel.setIcon(new
                            ImageIcon("images/img.jpg"));
                    break;
                case "Hide" :
                    imgLabel.setVisible(false); break;
                case "ReShow" :
                    imgLabel.setVisible(true); break;
                case "Exit" :
                    System.exit(0); break;
            }
        }
    }

    public static void main(String [] args) {
        new MenuActionEventEx();
    }
}
