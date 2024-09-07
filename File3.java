package _concept.IOASSIGNMENT;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class File3 {
    public static void main(String[] args) {
        try{
            File file =new File ("Customer.txt");
            FileOutputStream fout=new FileOutputStream(file);
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            Customer c=new Customer( 101,"abc",23,"9755033144");
            Customer c1=new Customer(102, "Mansi", 21, "9755933144");
            Customer c2=new Customer(103, "Varsha", 20, "8305290421");
            oos.writeObject(c);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.close();
            System.out.println("Operation success.....");
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    
}
