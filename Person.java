import java.util.*;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this .name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String toString(){
        return name+"(+"+ age +")";
    }
}
//Comparator to sort by age>>>>>
class AgeComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return Integer.compare(p1.getage(),p2.getage());
    }
}
//Compare to sort by name>>>>>
class NameComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getname().compareTo(p2.getname());
    }

}
class ComparartorExample{
    public static void main(String[]args){
        //create a list of person object>>>
        List<Person>p1=new ArrayList<>();
        p1.add(new Person("Mansi", 21));
        p1.add(new Person("Varsha", 20));
        p1.add(new Person("Bhumi", 22));
    }
}
