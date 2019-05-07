class For{
    public static void main(String [] args){
    int[] array = {1,2,3,4,5,6,7,8,9,0};    
    // for loop
    for(int i = 0; i<array.length; i++ )
        System.out.print(array[i] + " ");
    
    System.out.println();

    // for each loop
    for(int j : array)
        System.out.print(j + " ");
    }
}