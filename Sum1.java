package basics;
import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args) {
       
        System.out.println("Simple calculater:");
        System.out.println("1.Addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        

        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter first number a:");
        int a=sc.nextInt();
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter second number b:");
        int b=sc1.nextInt();
        int result=0;
        System.out.println("Enter your choice(1-4):");
        int choice=sc.nextInt();

        if(choice==1){
            if (choice == 1) {
                result = a + b;
                System.out.println("Result: " + a + " + " + b + " = " + result);
            } else if (choice == 2) {
                result = a- b;
                System.out.println("Result: " +a + " - " + b + " = " + result);
            } else if (choice == 3) {
                result = a* b;
                System.out.println("Result: " + a+ " * " + b + " = " + result);
            } else if (choice == 4) {
                if (b != 0) {
                    result = a/ b;
                    System.out.println("Result: " + a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
    
            sc.close();
        }
    }

 }




    
    

