import java.util.Scanner;

public class ScannerDemo 
  {
     public static void main(String[] args) throws Exception 
       { 
   	java.io.File file = new java.io.File("b.txt");
   	Scanner input = new Scanner(file);
   	while(input.hasNext()) 
          {
              int s = input.nextInt();
              System.out.println(s);
          }
        input.close();
       }
  }
