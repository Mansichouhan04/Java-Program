package _concept.StringAssignment;
/*4.Write a Java program to concatenate a given string to the end of another string.
String 1: PHP Exercises and                                                                                   
String 2: Python Exercise
The concatenated string: PHP Exercises and Python Exercises*/
public class Ass4 {
    public static void main(String[] args) {
        String s1="PHP Exercise and ";
        String s2="Python Exercise";
        System.out.println("Before concat the string s1 is:"+s1);
        System.out.println("Before concat the string s2 is:"+s2);
        System.out.println("After concate the string is:");
        String s3=s1.concat(s2);
        System.out.println("The Concatenated String:"+s3);
    }
}
