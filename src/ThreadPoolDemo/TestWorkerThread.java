package ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWorkerThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creatig a pool of 5 thread
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute methode of ExecutorService

        }
        executor.shutdown();
        while (!executor.isShutdown()) {
            System.out.println("finished all thread");
        }

    }
}
