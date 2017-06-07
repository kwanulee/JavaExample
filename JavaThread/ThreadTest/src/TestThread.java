class TimerThread extends Thread {
    int n = 0;

    public void run() {
        while(true) { // 무한루프를 실행한다.
            System.out.println(n);
            n++;
            try {
                sleep(1000); //1초 동안 잠을 잔 후 깨어난다.
            }
            catch(InterruptedException e){return;}
        }
    }
}

public class TestThread {
    public static void main(String [] args) {
        TimerThread th = new TimerThread();
        th.start();
        System.out.println("Main Thread 종료");
    }

}
