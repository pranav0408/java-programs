class Brk{
    public static void main(String [] args){

        outer:
        for (int i = 0; i < 10; i++){

            inner:
            for (int j = 0; j < 10; j++){
                if(j>5)
                    break outer;
                System.out.print(" "+ i + j + " ");    
            }
          System.out.println(" * ");  
        }

    }
}

// Similarly labelled continue