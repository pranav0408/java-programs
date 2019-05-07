import java.io.*;

class Replace{
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder sb = new StringBuilder(s);
        s = sb.replace(0, 5, "bla").toString();
        System.out.println(s);
    }
}