package _concept.Exception_handling;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Test2 {
    public static void main(String[] args) {
    ReadAndWrite r= new ReadAndWrite();
    try{
        r.readfile();
    }
    catch(FileNotFoundException e){
        //e.printStackTrace();
        System.out.println(e);
    }
  }   
}
