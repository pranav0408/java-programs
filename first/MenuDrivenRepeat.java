import java.util.*;

class Options{
    double total_price = 0;

    double a[] = {-1,100.00,150.00,200.00,250.00};

    public void display(){
        System.out.println("The price are listed below");
        System.out.println("1: Noodles      => 100.00");
        System.out.println("2: Donuts       => 150.00");
        System.out.println("3: Taco         => 200.00");
        System.out.println("4: Zingy Parcel => 250.00");
    }
    public void select(double dynamic_select){
        this.total_price += dynamic_select;
    }
    public void get_price(){
        System.out.println(this.total_price);
    }    
}

public class MenuDrivenRepeat{
    public static void main(String[] args) {
    int choice;
        char ch = 'y';
        Scanner sc = new Scanner(System.in);
        Options obj = new Options();
        while(ch=='y'||ch=='Y'){
            obj.display();
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1: obj.select(obj.a[choice]);break;
                case 2: obj.select(obj.a[choice]);break;
                case 3: obj.select(obj.a[choice]);break;
                case 4: obj.select(obj.a[choice]);break;
             }
             System.out.println("Continue to add? y/n");
             ch = sc.next().charAt(0);
        }    
        System.out.println("Your bill amount is: " + obj.total_price);
    }
}