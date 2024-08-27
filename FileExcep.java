package _concept.Exception_handling;

import java.io.FileInputStream;

public class FileExcep {
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("d:/abc.txt");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
