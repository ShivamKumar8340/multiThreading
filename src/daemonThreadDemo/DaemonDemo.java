package daemonThreadDemo;

public class DaemonDemo extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon Thread is working");
        }else {
            System.out.println("user thread is working");
        }
    }

    public static void main(String[] args) {
        DaemonDemo t1 = new DaemonDemo();
        DaemonDemo t2 = new DaemonDemo();
        DaemonDemo t3 = new DaemonDemo();

        t1.setDaemon(true);
        t1.start();
          /*if we declare a thread as daemon after call start methode
           then it will throw exception bcz after call start
            it will work as a user thread*/
      // t1.setDaemon(true);
        t2.start();
        t3.start();
    }
}
