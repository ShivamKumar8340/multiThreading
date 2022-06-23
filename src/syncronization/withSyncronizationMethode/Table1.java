package syncronization.withSyncronizationMethode;

public class Table1 {
    synchronized void printTable1(int n) {
        for (int i =1;i<=10;i++) {
            System.out.println(n*i);

            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
