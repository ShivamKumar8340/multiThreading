package firstExample;

public class UsingThreadandRunnable  implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable is running");
    }

    public static void main(String[] args) {
        Runnable r1 = new UsingThreadandRunnable();
        Thread t1 = new Thread(r1,"thread is running");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
