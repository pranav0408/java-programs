class Void{

    public void callMe(){
        System.out.println("Call Successful");
        return;
    }
    public static void main(String[] args) {
     Void obj = new Void();   
        obj.callMe();
    }
}