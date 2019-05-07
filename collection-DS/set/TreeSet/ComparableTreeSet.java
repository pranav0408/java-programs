import java.util.*;

class Vehi implements Comparable<Vehi> {
    Integer price;

    public Vehi(int p){
        this.price = p; 
    }
    public int compareTo(Vehi v){
        return this.price.compareTo(v.price);
    }
}

class DemoCompare{
    public static void main(String[] args) {
        TreeSet<Vehi> ts = new TreeSet<>();
        ts.add( new Vehi(3000) );
        ts.add( new Vehi(2000) );
        ts.add( new Vehi(1000) );

        for( Vehi v: ts ){
            System.out.println(v.price);
        }
    }
}