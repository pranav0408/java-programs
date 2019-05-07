enum collc {
    pizza(), rum_ball(), donut(), taco(), burger();

    double price;
    // collc(double price){
    //     this.price = price;
    // }
}

public class trytrytry{

    public static void main(String[] args) {
        collc ob = collc.pizza;
        ob.pizza.price = 100.00;
        System.out.println("Pizza: " + ob.pizza.price);
        System.out.println("Rum_Ball: " + ob.rum_ball.price);
        System.out.println("Donut: " + ob.donut.price);
        System.out.println("Taco: " + ob.taco.price);
        System.out.println("Burger: " + ob.burger.price);

    }
}