//Create a HashSet of names. Add 5 names, then convert this HashSet into an ArrayList and print the resulting list.
import java.util.HashSet;
import java.util.ArrayList;
public class ConverToArrayList {
     public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Mansi");
        hs.add("Poornima");
        hs.add("Varsha");
        hs.add("Nikita");
        hs.add("Kashish");
        System.out.println("The hashset list is::"+hs);
        ArrayList<String>al=new ArrayList<>(hs);
        System.out.println("Name in ArrayList::"+al);
    }
}
