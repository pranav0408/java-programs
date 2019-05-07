import java.util.*;

class Car{
    private String name;
    private Double mileage;
    private Double price;
    
    Car( String n, Double m, Double p ){
        this.name = n;
        this.mileage = m;
        this.price = p;
    }
    String getName(){
        return this.name;
    }
    Double getMileage(){
        return this.mileage;
    }
    Double getPrice(){
        return this.price;
    }
}

class DemoCar{
    public static void main(String[] args) {
        HashMap <Double,Car> m = new HashMap<>();

        m.put( 2000.00 , new Car("bla1", 50.0, 2000.00 ) );
        m.put( 1000.00 , new Car("bla2", 60.0, 1000.00 ) );
        m.put( 3000.00 , new Car("bla3", 70.0, 3000.00 ) );
        m.put( 4000.00 , new Car("bla4", 80.0, 4000.00 ) );
        m.put( 5000.00 , new Car("bla5", 90.0, 5000.00 ) );
        
        TreeSet<Car> tc = new TreeSet<>( (x,y) -> {return y.getPrice().compareTo(x.getPrice()) ;}  ); 
    
        Scanner sc = new Scanner(System.in);
        Double l,u;
        System.out.println("Enter upper and lower range of double price.");
        u = sc.nextDouble();
        l = sc.nextDouble();

        for( Double d : m.keySet() ){
            if( d>=l && d<=u ){
                if( m.get(d) instanceof Car ){
                    Car c = m.get(d);
                    tc.add(c);
                }
            }
        }
        for( Car c : tc ){
            System.out.println( "Name: "+ c.getName() +"." );
            System.out.println("Mileage: " + c.getMileage() +".");
            System.out.println("with price :" +c.getPrice() +".\n" );
        }
    }
}