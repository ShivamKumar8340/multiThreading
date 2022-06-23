package firstExample;

public class withoutwxtendThreadClass {
    public static void main(String[] args) {
        Thread t1 = new Thread("thread created without extending thread class");
        t1.start();
        String str = t1.getName();
        System.out.println(str);

    }
}
