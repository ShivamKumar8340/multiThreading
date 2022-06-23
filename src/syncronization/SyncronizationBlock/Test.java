package syncronization.SyncronizationBlock;

public class Test {
    public static void main(String[] args) {
        Table3 obj = new Table3();
        MyThread3 t3 = new MyThread3(obj);
        MyThread4 t4 = new MyThread4(obj);
        t3.start();
        t4.start();
    }
}
