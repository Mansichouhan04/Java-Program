package _concept.EXCEPTION;

import java.util.Scanner;

public class Exp3 {
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
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("OOps!something went wrong");
            //e.printStackTrace();
        }
          System.out.println("At the end....");
    }
}


