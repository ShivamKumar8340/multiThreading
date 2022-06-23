package firstExample;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(" runnable Thread is running");
    }

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
