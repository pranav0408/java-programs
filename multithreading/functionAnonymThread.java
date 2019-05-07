class funct{
    public static void main(String[] args) {
        Thread t = new Thread(
            () -> {
                char c = 'A';
                for(int i = 0; i < 26; i++){
                   System.out.println(c);
                   c++; 
                }
            }
        );
        t.start();
    }
}