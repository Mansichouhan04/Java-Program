package _concept.EXCEPTION;
import java.util.Scanner;
//import java.util.InputMismatchException;
public class Excep1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter 1st value:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Vlaue:");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Result=" +c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator can not be zero");
            e.printStackTrace();
        }
       /*  catch(InputMismatchException e){
            System.out.println("Please enter integer only");
            e.printStackTrace();
        }*/
        System.out.println("At the end....");
    }
}
