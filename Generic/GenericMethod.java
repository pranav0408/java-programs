class GenericMethod{

    public static <E extends Comparable<E>> E max( E [] list ){
        E max = list[0];
        for(E ob:list){
            if(ob.compareTo(max) >0 ){
                max = ob;
            }
        }
        return max;
    }
}
// < E extends Comparable<E> >
// greates function to be generic
// inheriting Comparable interface with extends keyword
// E is data type of list and return type of max()

// There are 4 restrictions in Generic