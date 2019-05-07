import java.io.*;

public class InputStreamDemo 
 { 
  public static void main(String[] args) throws IOException 
    { 
      FileInputStream fis = null;
      int i = 0;
      char c;
       try         
         {  
            fis = new FileInputStream("test.txt");
            while((i=fis.read())!=-1)
             {
                c=(char)i;
                System.out.print(c);
             }
         }
      catch(FileNotFoundException ex)
       { 
       }
      finally{ 
                 if(fis!=null)
                 fis.close();
		 //System.out.print(" "+fis.read()); 
              }
   }
 }
