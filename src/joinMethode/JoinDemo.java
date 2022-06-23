package joinMethode;

public class JoinDemo  extends Thread{
    @Override
    public void run() {
        for (int i =0;i<2;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("current Thread name is : "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinDemo t1= new JoinDemo();
        JoinDemo t2 = new JoinDemo();
        JoinDemo t3 = new JoinDemo();

        // join() on t1 thread
        t1.start();
        try {
            System.out.println("current thread name is : "+Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // join methode on t2 thread
        t2.start();
        try {
            System.out.println("current Thread name is : "+Thread.currentThread().getName());
            t2.join();
        } catch (Exception e){
            System.out.println(e);
        }

        t3.start();
    }
}
