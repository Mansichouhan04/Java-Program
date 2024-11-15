package List_questions;
//How would you sort an ArrayList of custom objects, like a Student class, based on their marks?

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return name+":"+marks;
    }
}
public class Sort_Student{
    public static void main(String[] args) {
        ArrayList<Student>obj1=new ArrayList<>();
        obj1.add(new Student("John", 85));
        obj1.add(new Student("Emily", 90));
        obj1.add(new Student("Alex", 78));
        Collections.sort(obj1,new Comparator<Student>()
        {
           public int compare(Student s1,Student s2)
           {
            return s1.marks-s2.marks;
           }
        });
        for(Student s:obj1){
            System.out.println(s);
        }
    }
}
