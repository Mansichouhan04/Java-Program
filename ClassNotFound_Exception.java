package _concept.Exception_handling;
import java.sql.*;
public class ClassNotFound_Exception {
    public static void main(String[] args) {
    try{
    System.out.println("Born java");
    Class.forName("com.mysql.jdbc.driver");//clas not found exception....
    }
    catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("RIP Java");
    }
}
