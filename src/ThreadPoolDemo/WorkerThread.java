package ThreadPoolDemo;

public class WorkerThread implements Runnable{

    private String message;
    public WorkerThread(String m){
        this.message=m;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"(start) message : "+message);
        processsmessage();
        System.out.println(Thread.currentThread().getName()+"(end)");

    }
    private void processsmessage() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
