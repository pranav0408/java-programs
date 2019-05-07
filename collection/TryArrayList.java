import java.util.*;

public class TryArrayList{

    public void search(){
    
    }
    public static void main(String[] args) {
        ArrayList <Employee> all = new ArrayList<>();
        all.add(new Employee("A",1,1000.00));
        all.add(new Employee("B",2,2000.00));
        all.add(new Employee("C",3,3000.00));
        all.add(new Employee("D",4,4000.00));
        all.add(new Employee("E",5,5000.00));
    }
}


class Employee{
    private String name;
    private int id;
    private Double salary;

    public Employee(String name,int id,Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void getEmployee(){
        System.out.println(this.salary + this.id); 
    }
}