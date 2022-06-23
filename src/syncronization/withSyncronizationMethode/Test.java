package syncronization.withSyncronizationMethode;

public class Test {
    public static void main(String[] args) {
        Table1 obj = new Table1();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
