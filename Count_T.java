package _concept.IOASSIGNMENT;
import java.io.File;
import java.io.FileInputStream;

public class Count_T {
    public static void main(String[] args) {
        try{
            File f=new File("data.txt");
            FileInputStream fin= new FileInputStream(f);
            String d="";
            int count=0;
            while(true){
                int x=fin.read();
                if((char)x=='t')
                {
                    count++;
                }
                if(x==-1)
                break;
                d=d+(char)x;
            }
            System.out.println("File data----"+d);
            System.out.println("'t'occurs----"+count);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
