package _concept.Assignment_ExceptionHandling;
import java.util.Scanner;
//custom exception class.
class OddNumberException extends RuntimeException {
    OddNumberException(String message){
        super(message);
    }
}

class Assignment21{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        try{
            checkNumber(num);
        }
        catch(OddNumberException e){
        e.printStackTrace();
        }
    }
    public static void checkNumber(int num) throws OddNumberException{
        if (num%2!=0){
            throw new OddNumberException("The number is odd.");
        }
        System.out.println("The number is even.");
    }
}
