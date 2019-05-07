import java.util.*;

class DemoMultiCatch{
    public static void main(String[] args)throws Exception {
        String []ar ={"121","2","3","4"};
        Scanner sc = new Scanner(System.in);
        int x=0, y=0;
        String s = null;
        try{
            x = Integer.parseInt(ar[0]);
            y = Integer.parseInt(ar[1]);
            if(s.equals("bla")){
               System.out.println("Equal"); 
            }
        }
        // multi-catch. 'e' reference Cannot be reassigned
        catch( ArrayIndexOutOfBoundsException | NumberFormatException e  ){
            System.out.println("\nException " +e+ " has occured.\n Enter Two Integers");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        // Exception Chaining. Reference 'e' can be reassigned
        catch(RuntimeException e){
            System.out.println( "_________________________________________________");
            System.out.println("\n|||* * * *Runtime Exception has ocured.* * * *|||\n");
            System.out.println( "_________________________________________________");
            e = new NullPointerException();            
            throw e;
        }
        //  below is normal catch
        // catch( ArrayIndexOutOfBoundsException e ){
        //     System.out.println("Enter Two Integers");
        //     x = sc.nextInt();
        //     y = sc.nextInt();
        // }
        // catch( NumberFormatException e ){
        //     System.out.println("Enter Two Integers");
        //     x = sc.nextInt();
        //     y = sc.nextInt();
        // }
        System.out.println("Value of x is " +x+ ".");
        System.out.println("Value of y is " +y+ ".");

    }
}