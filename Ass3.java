package _concept.StringAssignment;
/*3.Write a Java program to compare two strings lexicographically, ignoring case differences.
String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"*/
public class Ass3 {
    public static void main(String[]args)
    {
        String s1="This is exercise 1";
        String s2="This is Exercise 1";
        int Comparison = s1.compareToIgnoreCase(s2);
        
        if(Comparison<0)
        {
            System.out.println(s1+" "+"is less than"+" "+s2);
        }
        else if(Comparison>0)
        {
            System.out.println(s1+" "+"is grater than"+" "+s2);
        }
        else{
            System.out.println(s1+" "+"is equal to the"+" " +s2+" "+"When ignoring case");
           
        }
    }
}

    

