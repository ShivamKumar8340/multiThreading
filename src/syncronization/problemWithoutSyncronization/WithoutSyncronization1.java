package syncronization.problemWithoutSyncronization;

public class WithoutSyncronization1 extends Thread{
    Table t;
    WithoutSyncronization1(Table t) {
        this.t= t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }

}
