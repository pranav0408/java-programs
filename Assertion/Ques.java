import java.io.*;
class Ques{

    public static double calculateInterest( int amt, double roi, int years ){
        double val=0.0;;
        assert amt>0:"Enter amount value more than 0";
        assert roi>1:"Enter rate more than 1";
        assert years>=1:"Enter years >= 1";

        val = amt*roi*years / 100;
        val = amt + val;

        return val;
    }

    public static void main(String[] args)throws Exception {
        int a=0;
        double r=0;
        int y =5;
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in) );
        System.out.println("Enter amount value");
        a = Integer.parseInt(in.readLine());
        System.out.println("Enter rate of interest value");
        r = Double.parseDouble(in.readLine());
        System.out.println("Enter years value");
        y = Integer.parseInt(in.readLine());
        
        Ques.calculateInterest(a, r, y);
    }
}