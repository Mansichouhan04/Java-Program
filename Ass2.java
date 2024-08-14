package _concept.StringAssignment;
/*2.Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2"*/ 
public class Ass2 {
    public static void main(String[]args)
    {
        String s1="This is Exercise1";
        String s2="This is Exercise2";
        //String s3="hello";//if we compare s3 and s4 than it give output is equal and 0>>>>
       // String s4="hello";
       int Comparison=s1.compareTo(s2);
       System.out.println(Comparison);
        if(Comparison<0)
        {
            System.out.println(s1+" is less than"+" "+s2);
        }
        else if(Comparison>0)
        {
            System.out.println(s1+"is grater than"+" "+s2);
        }
        else{
            System.out.println(s1+"is equal to the"+" " +s2);
        }
    }
}
