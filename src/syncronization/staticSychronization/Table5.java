package syncronization.staticSychronization;

public class Table5 {
    synchronized static void printTable5(int n) {
        for (int i=1;i<=10;i++) {
            System.out.print(n*i+",");
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
