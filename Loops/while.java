class FOR{
    public static void main(String[] args){
    int x=0;
    final boolean b = false;
        while(b){
            x++;
            if(false)
                System.out.println(x);
        }
    }
}

// while (false) gives an error but if(false) is okay to use
// while (final boolean) gives an error since here final boolean b = false is constant false
