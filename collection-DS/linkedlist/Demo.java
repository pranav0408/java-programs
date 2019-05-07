import java.util.*;

class Demo{
    public static void main(String[] args) throws Exception {
        LinkedList <Integer> LL = new LinkedList<>();
        LL.addFirst(null);
        if( LL.removeFirst() instanceof Integer ){
            System.out.println("bla bla Integer");
        }
    }
}