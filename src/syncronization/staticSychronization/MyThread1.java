package syncronization.staticSychronization;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        Table5.printTable5(2);

    }
}
