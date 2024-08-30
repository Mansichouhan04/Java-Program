package _concept.Exception_handling;
import java.util.Scanner;
public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        try{
            System.out.println("Hello");
            System.out.println(10/n);
            String name=null;
            System.out.println(name.length());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
