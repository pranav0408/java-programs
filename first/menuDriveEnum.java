import java.util.*;

enum Items{
    BURGER(99.89), PIZZA(320.89), TACO(140.29), DONUT(70.59);

    double defPrice;
    Items( double defPrice){
        this.defPrice = defPrice;
    }
}



class menuDriveEnum{
    double price = 0.0f;
    Items ob;
    Scanner sc = new Scanner(System.in);
    
    public void input(){
        System.out.println("Enter choice:");
        System.out.println("BURGER: price = "+ob.BURGER.defPrice);
        System.out.println("PIZZA: price = "+ob.PIZZA.defPrice);
        System.out.println("TACO: price = "+ob.TACO.defPrice);
        System.out.println("DONUT: price = "+ob.DONUT.defPrice);
        String val = sc.nextLine();
        
        ob = Items.valueOf(val);

        switch(ob){
            case BURGER: price = price + ob.BURGER.defPrice; break;
            case PIZZA: price = price + ob.PIZZA.defPrice; break;
            case TACO: price = price + ob.TACO.defPrice; break;
            case DONUT: price = price + ob.DONUT.defPrice; break;
        }
    }
    public void drive(){
        int check = 1;
        while(check==1){
            input();
            System.out.println("\nEnter 1 to add more items to the list");
            System.out.println("Enter 2 to quit");
            check = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Total price in te list: " + price);
    }
    public static void main(String[] args) {
        menuDriveEnum obj = new menuDriveEnum();
        obj.drive();
    }
}