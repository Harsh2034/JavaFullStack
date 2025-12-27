package Day9;

public class Multithreading {
    private int balance=100000;

    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit "+Thread.currentThread().getName()+" "+amount+" "+balance);
    }

    public synchronized void withdraw(int amount){
        if(balance<amount){
            System.out.println("withdraw "+Thread.currentThread().getName()+" Insufficient balance!");
        }
        else {
            System.out.println("withdraw "+Thread.currentThread().getName()+" "+amount+" "+balance);
            balance=-amount;
        }
    }
}
class BankUser extends Thread{
	Multithreading account;
    BankUser(Multithreading account,String name){
        super(name);
        this.account=account;
    }
    public void run(){
        account.deposit(500);
        account.withdraw(750);
    }
}
class BankTransactionDemo{
    public static void main(String[] args) {
    	Multithreading a = new Multithreading();
        BankUser t = new BankUser(a,"John");
        BankUser t1 = new BankUser(a,"Paul");
        BankUser t2 = new BankUser(a,"Tony");
        t.start();
        t1.start();
        t2.start();
    }
}