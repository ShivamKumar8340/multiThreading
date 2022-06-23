package syncronization.SyncronizationBlock;

public class MyThread3 extends Thread {
    Table3 t3;
    MyThread3(Table3 t3) {
        this.t3=t3;
    }

    @Override
    public void run() {
        t3.printTable3(5);
    }
}
