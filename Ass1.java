package _concept.StringAssignment;
//1.Write a Java program to get the character at the given index within the string.
import java.util.Scanner;
public class Ass1 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
           System.err.println(str.charAt(i)+" "+ "index="+i);
        }
        sc.close();
    }
    
}
