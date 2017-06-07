import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    JLabel timerLabel; // 타이머 값이 출력되는 레이블

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    int n = 0;

    public void run() {
        while(true) { // 무한루프를 실행한다.
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                sleep(1000); //1초 동안 잠을 잔 후 깨어난다.
            }
            catch(InterruptedException e){return;}
        }
    }
}


public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel("0");
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        setSize(250,150);
        setVisible(true);

        TimerThread th = new TimerThread(timerLabel);
        th.start();

    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
