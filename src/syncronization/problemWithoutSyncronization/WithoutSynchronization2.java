package syncronization.problemWithoutSyncronization;

public class WithoutSynchronization2 extends Thread{
    Table t;
    WithoutSynchronization2(Table t) {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(8);
    }
}
