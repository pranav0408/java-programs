class test{
    void bla(int a){
        System.out.println("int");
    }
    void bla(long a){
        System.out.println("long");
    }
}
class Practice{
    public static void main(String[] args) {
        test obj = new test();
        obj.bla(1);
    }
}