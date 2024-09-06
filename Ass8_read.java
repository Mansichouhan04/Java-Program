package _concept.IOASSIGNMENT;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class ReadData {
    public static void main(String[] args) {
     try{
            FileInputStream fin=new FileInputStream("Shopping.bin");
            ObjectInputStream ois=new ObjectInputStream(fin);
            Item i1=(Item) ois.readObject();//object
            Item i2=(Item) ois.readObject();//object
            Item i3=(Item) ois.readObject();//object
            
            System.out.println(i1.getItemName()+" "+i1.getPrice()+" "+i1.getQuantity());
            System.out.println(i2.getItemName()+" "+i2.getPrice()+" "+i2.getQuantity());
            System.out.println(i3.getItemName()+" "+i3.getPrice()+" "+i3.getQuantity());
            double price1=i1.getPrice()*i1.getQuantity();
            double price2=i2.getPrice()*i2.getQuantity();
            double price3=i3.getPrice()*i3.getQuantity();
            System.out.println("Total money="+( price1+price2+price3));
            ois.close();
        }
            catch(Exception e){
             e.printStackTrace();
        }
       
    }
}
