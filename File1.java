package _concept.IOASSIGNMENT;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 class File1 {
    public static void main(String[] args) {
        try{
            File f=new File("data.txt");
            FileOutputStream fout =new FileOutputStream(f,true);
            String data="Java is a Simple and platform independent language";
            byte b[]=data.getBytes();
            fout.write(b);
            System.out.println("Operation success......");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
