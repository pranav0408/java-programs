import java.util.*;
class PresentToPast{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    s = in.nextLine();    
    // String s = "Pranav is typing" ;
    
    String ss = s.replace("is","was").replace("am","was").replace("are","were");

    System.out.println("Sentence in Past Continous: " + ss);
   }
}