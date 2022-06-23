package syncronization.problemWithoutSyncronization;

public class TestTable {
    public static void main(String[] args) {
        Table obj = new Table();//only one object
        WithoutSyncronization1 t1 = new WithoutSyncronization1(obj);
        WithoutSynchronization2 t2 = new WithoutSynchronization2(obj);
        t1.start();
        t2.start();
    }
}
