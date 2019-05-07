// A program to throw an exception that will never be thrown...

class Excep{
    public static void main(String[] args) throws Exception{
        if(false){
            throw new NullPointerException();
        }
    }
}