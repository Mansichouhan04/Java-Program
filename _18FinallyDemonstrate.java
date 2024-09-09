//Write a program to demonstrate the finally block.
package _concept.Assignment_ExceptionHandling;
import java.io.FileInputStream;
public class _18FinallyDemonstrate {
    public static void main(String[] args) {
        try{
        System.out.println("Open the file");
        FileInputStream fils= new FileInputStream("D://abc.txt");
        fils.read();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Close the file");
        }
    }
    
}