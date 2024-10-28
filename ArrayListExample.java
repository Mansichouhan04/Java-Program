import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> ob=new ArrayList<>();
       ob.add(14);
       ob.add(9);
       ob.add(2);
       ob.add(3);
       ob.add(16);
       System.out.println("The Original ArrayList is::"+ob);
       ob.removeIf(n -> n%2!=0);
       System.out.println("After Arraylist is::"+ob);
    }
    
}
