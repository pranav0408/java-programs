import java.util.*;
import java.time.*;

class Person{

    ArrayList <Person> person = new ArrayList <Person>();
    ArrayList <Vehicle> vehicle = new ArrayList <Vehicle>();
    
    String name;
    String d_o_b;
    static String id = "1";
    
    Person(){}
    Person(String n, String db){
        this.name = n;
        this.d_o_b = db;
    }

    public void validate(String n,String db){
        int age = Period.between( LocalDate.parse(db), LocalDate.now() ).getYears();
        if(age>=18){
            id = id + "1";
            vehicle.add(new Vehicle(id,"SantraX"));
            System.out.println("Congrats "+n+". Your vehicle has been added with vehi_num "+id);
        }
        else{
            System.out.println("Sorry "+n+". You don't meet minimum age requirement. Your age is "+age+". Minimum is 18 years." );
        }
    }
    public void display(){
        for( Vehicle v : vehicle ){
            System.out.println("Vehicle number is " + v.vehi_num + ". Vehicle model is "+v.vehi_model);
            System.err.println("Owner is " + this.name);
        }
    }
    class Vehicle{
        String vehi_num;
        String vehi_model;

        Vehicle(String n,String m){
            this.vehi_num = n;
            this.vehi_model = n;
        }
    }

    public static void main(String[] args) {
        
        Person p = new Person();
        Scanner sc = new Scanner(System.in);

        String d_o_b;
        String name;

        //first person details input
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your dob in 'YYYY-MM-DD format' ");
        d_o_b = sc.nextLine();
        //first person object
        p.person.add( new Person(name,d_o_b) );
        //first person validation
        Person p0 = p.person.get(0);
        p0.validate(name,d_o_b);
        
        //second person details input
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your dob in 'YYYY-MM-DD format' ");
        d_o_b = sc.nextLine();
        //second person object
        p.person.add( new Person(name,d_o_b) );
        //second person validation
        Person p1 = p.person.get(1);
        p1.validate(name,d_o_b);

        //second person retrieve
        p1.display();
        //first person retrieve
        p0.display();
    }


}