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
    public double get_price(){
        return total_price;
    }    
}

public class MenuDrivenArrayObject{
    public static void main(String[] args) {
    int choice;
        char ch = 'y', main_ch = 'y';
        int people,person;
        double get_price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of people");
        people = sc.nextInt();

        Options obj[] = new Options[people+1];

        for( int i=0; i<people; i++)
            obj[i] = new Options();        

while( main_ch == 'y' || main_ch == 'Y' ){
    System.out.println("Enter 1 to get the order");
    System.out.println("Enter 2 to get the bill");
    int main_choice = sc.nextInt();

    switch(main_choice){
        case 1:
                 System.out.println("Enter the nth person index");
                 person = sc.nextInt();
          
            while(ch=='y'||ch=='Y'){
                obj[person].display();
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                switch(choice){
                    case 1: obj[person].select(obj[person].a[choice]);break;
                    case 2: obj[person].select(obj[person].a[choice]);break;
                    case 3: obj[person].select(obj[person].a[choice]);break;
                    case 4: obj[person].select(obj[person].a[choice]);break;
                 }
                 System.out.println("Continue to add in menu? y/n");
                 ch = sc.next().charAt(0);
            }
            break; // case 1
        case 2:
                System.out.println("Enter the nth person index to view his/her bill");
                person = sc.nextInt();
                get_price = obj[person].get_price();
                System.out.println("Person with index " + person + " has bill amount: " + get_price );
                break;
             }
           
             System.out.println("Go back to main menu? y/n");
             main_ch = sc.next().charAt(0);
             
        } // main switch
        
    } // main
}