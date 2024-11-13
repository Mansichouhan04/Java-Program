//Create a LinkedList of 4 countries, add one country to the beginning and one at the end, then print the list in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class ReverseList {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Australia");
        countries.add("Germany");
        countries.addFirst("Canada"); 
        countries.addLast("Brazil");
        Collections.reverse(countries);
        System.out.println("List in Reverse Order: " + countries);
    }
}
