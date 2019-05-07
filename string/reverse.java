import java.io.*;
import java.util.*;

class ReverseStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.nextLine();
        sb.insert(0, s);

        String ss = sb.reverse().toString();
        if(ss.equals(s)){
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not a Palindrome");

    }
}