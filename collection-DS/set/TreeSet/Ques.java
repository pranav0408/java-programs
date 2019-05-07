// A program to arrange the Integers in descending order in a TreeSet

import java.util.*;

class Ques{    
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>( (x,y) -> {return y.compareTo(x);}  );

        ts.add(500);
        ts.add(400);
        ts.add(300);

        Iterator<Integer> itr = ts.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
        }
    }    
}