class Student<T,U extends Number>{
    T name;
    U cgpa;
    Student( T t, U u ){
        this.name = t;
        this.cgpa = u;
    }
}
class Test{
    public static void main(String[] args) {
        Student s1 = new Student<String,Double> ("Pranav",8.8);
        Student s2 = new Student<String,Integer> ("Pranav",8);
        Student<String,Integer> s3 = new Student<> ("Pranav",8);
    }   
}