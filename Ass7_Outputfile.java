package _concept.IOASSIGNMENT;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Main {
    public static void main(String[] args) {
        try{
            File file =new File ("Shopping.bin");
            FileOutputStream fout=new FileOutputStream(file);
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            Item i1=new Item("Bag",1200,1);
            Item i2=new Item("Laptop",60000,1);
            Item i3=new Item("Dress",1000,6);
            oos.writeObject(i1);
            oos.writeObject(i2);
            oos.writeObject(i3);
            oos.close();
            System.out.println("Operation success.....");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}