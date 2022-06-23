package syncronization.withSyncronizationMethode;

public class MyThread1 extends Thread{
    Table1 t1;
    MyThread1(Table1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        t1.printTable1(5);
    }
}
