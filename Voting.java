package _concept.Exception_handling;
import java.util.Scanner;
public class Voting {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("You are not eligible for vote");
            }
            else{
                System.out.println("You are eligible for vote");
            }
        }
            catch(InvalidAgeException e){
                System.out.println(e);
            }
    
        }
}



