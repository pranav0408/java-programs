class B{
    static private B ob;
    
    private B(){
        System.out.println("In B");
    }

    static public B getInstance(){
        if(ob==null){
            ob = new B();
        }
        return ob;
    }
}

class TestSingleton{
    public static void main(String[] args) {
        B ob1 = B.getInstance();
        B ob2 = B.getInstance();
        System.out.println(ob1 == ob2);
    }
}