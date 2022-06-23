package joinMethode;

public class JoinMileSecondExample extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

            JoinMileSecondExample t1 = new JoinMileSecondExample();
            JoinMileSecondExample t2 = new JoinMileSecondExample();
            JoinMileSecondExample t3 = new JoinMileSecondExample();

            t1.start();
            try {
                t1.join(2000);
            }catch (Exception e){
                System.out.println(e);

            }
            t2.start();
        t3.start();
    }
}
