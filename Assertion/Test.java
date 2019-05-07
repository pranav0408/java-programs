class Test{

    void try_num(int positive, int negative){
        assert positive>=0:"Positive number must be >= 0.";
        assert negative<0:"Negative number must be < 0.";
    }

    public static void main(String[] args) {
        Test ob = new Test();
        ob.try_num( 12,12 );
    }
}