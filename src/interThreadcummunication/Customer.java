package interThreadcummunication;

public class Customer {
    int amount = 7000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw");

        System.out.println("your balance is :"+this.amount);

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit ");
            try {
                wait();
            } catch (Exception e) {}
        }
            this.amount-=amount;
            System.out.println("withdraw completed");
            System.out.println(" now your balane is : "+this.amount);

    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("deposit completed");
        System.out.println("balance is after deposit : "+this.amount);
        notify();
    }

}