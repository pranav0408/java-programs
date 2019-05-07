import java.util.*;

class DemoTreeSet{
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(20);
        ts.add(30);
        
        Iterator<Integer> itr = ts.iterator();

        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
        }

    }
}