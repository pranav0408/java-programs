enum Items{

        BURGER(100), PIZZA(400), TACO(150), DONUT;
        // constructor of enum is by default private
        int price;
        Items(){
            price = 50; //default price
        }
    
        Items(int price){
            this.price = price;
        }
    }

class moreEnum{
    static Items ob;
    
    public static void main(String[] args) {
        // System.out.println(Items.BURGER.price);

        Items ob = Items.BURGER;
        switch(ob){
                case BURGER: System.out.println(ob.price);break;
            }     
    }
}