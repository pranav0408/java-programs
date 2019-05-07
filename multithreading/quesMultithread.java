// A program to define a class Student with attributes name, cgpa and number of reappears.

// Class Demo should implement a method
// int EligibleStudents(Eligibility ob) to return the count of all eligible students

// Eligibility is a functional interface with abstract method boolean check(Student s)

import java.util.*;

@FunctionalInterface
interface Eligibility{
    boolean check(Student s);
}

class Student{
    String name;
    Double cgpa;
    int re_appear;
    Student(){}

    Student(String n, Double c, int r){
        this.name = n;
        this.cgpa = c;
        this.re_appear = r;
    }

    int EligibleStudents( Eligibility ob , ArrayList<Student> s ){
        int count = 0;
        for( Student list_s : s ){
            if( ob.check(list_s) )
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        ArrayList <Student> ar = new ArrayList<>();
        ar.add(new Student("Pranav",8.75,0));
        ar.add(new Student("Singh",6.75,0));
        
        int get;
        
        Student bla = new Student();
        get = bla.EligibleStudents( ob ->  ob.cgpa > 8  , ar );
        System.out.println("Number of eligible students based on CGPA is " + get);
        get = bla.EligibleStudents( ob -> ob.re_appear == 0 , ar);
        System.out.println("Number of eligible students based on Re-Appears is " + get);
    }
}