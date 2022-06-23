package syncronization.withSyncronizationMethode;

public class MyThread2 extends Thread{
    Table1 t2;
    MyThread2(Table1 t2) {
        this.t2=t2;
    }

    @Override
    public void run() {
        t2.printTable1(8);
    }
}
