package syncronization.staticSychronization;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        Table5.printTable5(4);

    }
}
