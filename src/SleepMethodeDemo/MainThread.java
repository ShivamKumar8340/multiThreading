package SleepMethodeDemo;

public class MainThread {
    public static void main(String[] args) {
        for (int i = 0;i<5;i++){
        try {
            Thread.sleep(1000);
        } catch (Exception e ) {
            System.out.println(e);
        }
            System.out.println(i);
        }
    }
}
