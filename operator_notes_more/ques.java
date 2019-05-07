import java.util.*;

abstract class Account{
    int acc_no;
    final double rate;
    double balance;
    abstract void annualInterest();
    Account(double b,double r){
        this.balance = b;
        this.rate = r;
    }
}
class SavingAccount extends Account {
    private static int acc_no = 141001;

    SavingAccount(double balance){
        super(balance,4.5);
        acc_no++;
    }
    void getBalance(){
        System.out.println(this.balance);
    }
    void annualInterest(){
        this.balance = this.balance + (this.balance*this.rate) / 100;
    }
}
class CurrentAccount extends Account{
    private static int acc_no = 241001;
    CurrentAccount(double balance){
        super(balance,4.5);
        acc_no++;
    }
    void checkBalance(){
        System.out.println(this.balance);
    }
    void annualInterest(){
        this.balance = this.balance + (this.balance*this.rate) / 100;
    }
}

public class ques{
    public static void main(String[] args) {
        ArrayList<Account> arr = new ArrayList<>();
        arr.add( new SavingAccount(1000.00) );
        arr.add( new CurrentAccount(2000.00) );
        arr.add( new SavingAccount(3000.00) );
        arr.add( new SavingAccount(4000.00) );
        arr.add( new CurrentAccount(5000.00) );

        // Scanner sc = new Scanner(System.in);
        // int acc = sc.nextInt;

        for( Account ob : arr ){
            if(ob.instanceOf(SavingAccount)){
                SavingAccount x = (SavingAccount)ob;
                ob.getBalance();
            }
            else if(ob.instanceOf(CurrentAccount)){
                CurrentAccount x = (CurrentAccount)ob;
                ob.checkBalance();
            }
            
        } // for each
    } // main function
} // main class