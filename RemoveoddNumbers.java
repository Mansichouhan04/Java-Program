//Create an ArrayList of integers. Add 5 numbers, then remove all odd numbers and print the final list.
import java.util.ArrayList;

public class RemoveoddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(19);
        numbers.add(4);
        numbers.add(6);
        numbers.removeIf(n -> n % 2 != 0);
        System.out.println("Final List after removing odd numbers: " + numbers);
    }
}
