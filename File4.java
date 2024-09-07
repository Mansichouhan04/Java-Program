package _concept.IOASSIGNMENT;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class File4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("Customer.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            Customer c=(Customer) ois.readObject();//object
            Customer c1=(Customer) ois.readObject();//object
            Customer c2=(Customer) ois.readObject();//object
            ois.close();
            System.out.println(c.getId()+" "+c.getName()+" "+c.getage()+" "+c.getcontact()+"");
            System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getage()+" "+c1.getcontact()+"");
            System.out.println(c2.getId()+" "+c2.getName()+" "+c2.getage()+" "+c2.getcontact()+"");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
