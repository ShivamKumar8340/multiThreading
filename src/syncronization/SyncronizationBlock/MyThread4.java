package syncronization.SyncronizationBlock;

public class MyThread4 extends Thread{
    Table3 t4;
    MyThread4(Table3 t4) {
        this.t4=t4;
    }

    @Override
    public void run() {
        t4.printTable3(10);
    }
}
