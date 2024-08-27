package _concept.Exception_handling;
import java.util.Scanner;
public class FinallyBlock1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s.nextInt();
        try{
            System.out.println(10/n);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block is always executed");
        }
    }
    
}
