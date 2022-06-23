package syncronization.SyncronizationBlock;

public class Table3 {
    void printTable3(int n) {
        synchronized (this) {
            for (int i=1;i<=10;i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(n*i);
                }
            }
        }
    }
}
