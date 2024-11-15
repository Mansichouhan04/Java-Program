package List_questions;
//Write a program to remove duplicates from an ArrayList of integers.
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class Remove_Duplicate {
    public static void main(String[] args) 
    {
      ArrayList<Integer> obj=new ArrayList<>();
      obj.add(10);
      obj.add(20);
      obj.add(30);
      obj.add(20);
      obj.add(10);
      LinkedHashSet<Integer> ls=new LinkedHashSet<>(obj);
      obj.clear();
      obj.addAll(ls);
      System.out.println("List after removing duplicate numbers::"+obj);
    }
}
