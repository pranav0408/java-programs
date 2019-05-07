import java.util.*;

class Vehi{
    Integer price;

    public Vehi(int p){
        this.price = p; 
    }
}

class DemoComparator{
    public static void main(String[] args) {
        TreeSet<Vehi> ts = new TreeSet<>(  (x,y) -> {return y.price.compareTo(x.price);}  );
        ts.add( new Vehi(1000) );
        ts.add( new Vehi(2000) );
        ts.add( new Vehi(3000) );

        for( Vehi v: ts ){
            System.out.println(v.price);
        }
    }
}