package SleepMethodeDemo;

public class SleepDemo extends Thread{
    @Override
    public void run() {
        super.run();
    for (int i = 0;i<5;i++) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
    }

    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        SleepDemo t2 = new SleepDemo();
        t1.start();
        t2.start();
    }
}
