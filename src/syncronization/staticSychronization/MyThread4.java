package syncronization.staticSychronization;

public class MyThread4 extends Thread{
    @Override
    public void run() {
        Table5.printTable5(7);
    }
}
