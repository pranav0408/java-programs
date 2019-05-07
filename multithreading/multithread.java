interface Test{
    boolean isOK(int a);
}

class Demo{
    
    void process(Test ob, int x){
        if(ob.isOK(x)) System.out.println("OK");
        else           System.out.println("Not OK");
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        //one type
        d.process( x ->  x%2 == 1, 11 );
        // another menthod
        Test obj = x -> x>100;
        d.process( obj, 110 );
    }
}