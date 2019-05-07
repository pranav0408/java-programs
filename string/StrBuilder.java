import java.io.*;

class StrBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(2);
        sb.append("hello prnav");
        System.out.println(sb.capacity());  
    }
}