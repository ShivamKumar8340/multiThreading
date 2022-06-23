package firstExample;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("thread is running");

    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();

        t1.start();
    }
}
