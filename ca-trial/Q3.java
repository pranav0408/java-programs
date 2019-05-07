import java.util.*;
class PayTM_User{
    long mobile_number;
    String password;
    static ArrayList<PayTM_User> p_user = new ArrayList<>();

    PayTM_User(){}
    PayTM_User(long mob,String pass){
        this.mobile_number = mob;
        this.password = pass;
    }

    boolean sendMoney(long mobile_number,double amount){
        boolean flag = true;

        for( PayTM_User user : PayTM_User.p_user ){

            if( user.mobile_number == mobile_number ){

                        Scanner sc = new Scanner(System.in);
                        PayTM_User.Wallet wall = this.new Wallet();
                if( amount > wall.balance ){
                    System.out.println("Not enough amount in your wallet. Currently: " +wall.balance);
                    System.out.println("Enter the amount greater than " + ((int)amount-wall.balance) + " to add in your wallet!");
                    int b = sc.nextInt();
                    wall.addMoney(b);
                    System.out.println("Your updated balance is: " + wall.balance );
                }
                flag = true;
                
                PayTM_User.Wallet add = user.new Wallet();
                
                if( amount <= wall.balance ){
                    wall.balance -= (int)amount;
                    int amt = add.addMoney((int)amount);
                    System.out.println("Amount sent successfully. Updated balance of " + user.mobile_number +" is: "+ amt);
                    System.out.println("Your updated balance is: "+wall.balance);
                }
                else{
                    System.out.println("Amount to be sent is more than wallet balance");
                }
                    break;
                }
            else
                flag = false;
            }
        return flag;
    }

    class Wallet{
        int balance = 1000;
        //adds balance in balance
        public int addMoney(int bal){
            this.balance += bal;
            return balance;
        }
    }

    public static void main(String[] args) {
        p_user.add( new PayTM_User(123456789L, "1234"));
        p_user.add( new PayTM_User(987654321L, "5678"));
        Scanner sc = new Scanner(System.in);

        for( PayTM_User user : PayTM_User.p_user ){
            
            PayTM_User.Wallet add = user.new Wallet();
            add.addMoney(1000);           
        }

        long user_mob;
        String pass;
        long send_mob;
        double send_money;

        System.out.println("Enter your mobile number");
        user_mob = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter password");
        pass = sc.nextLine();

        boolean login = false;        
        for( PayTM_User user : PayTM_User.p_user ){
            boolean check=false;


            if( user.mobile_number == user_mob & user.password.equals(pass) ) {
                login = true;
                System.out.println("Enter number to send the money");
                send_mob = sc.nextLong();
                sc.nextLine();
                System.out.println("Enter amount to be sent");
                send_money = sc.nextDouble();

                check = user.sendMoney(send_mob,send_money);
                if(check==false) System.out.println("Receiver not available");
                break;
            }
        }
        if(login == false)
                System.out.println("Invalid login credentials");
    }
}

