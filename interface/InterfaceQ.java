interface X{
    int a = 5;
    void test();
    default public void demo(){
        System.out.println("default in X");
    }
    static public void show(){
        System.out.println("Nothing to show here");
    }
}

interface Y{
    int a = 5;
    void test();
    default public void demo(){
        System.out.println("Default in Y");
    }
}

abstract class A{
    int a = 5;
    abstract int add(int a,int b);
}

class Z extends A implements X,Y{
    public void test(){
        System.out.println("No testing");
    }
    public int add(int a,int b){
        return a+b;
    }
    public void demo(){
        System.out.println("Demo of X is:");
        X.super.demo();
        System.out.println("Demo of Y is:");
        Y.super.demo();
        System.out.println("Show() of X displays:");
        X.show();
    }
    public void printVar(){
        System.out.println("Var A in X: " + X.a);
        System.out.println("Var A in Y: " + Y.a);
        System.out.println("Var A in Z: " + super.a);

    }
    public static void main(String[] args) {
        Z o = new Z();
            o.test();
            int sum =  o.add(5, 6);
            o.demo();
            System.out.println("Sum from add() function is : " + sum);
            o.printVar();
    }
}