//Create a HashSet of 5 numbers. Check if a specific number exists and print whether it’s found or not.

import java.util.HashSet;
public class Checkifnumberexits {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int checkNumber = 30;
        if (numbers.contains(checkNumber)) {
            System.out.println("Number " + checkNumber + " is found.");
        } else {
            System.out.println("Number " + checkNumber + " is not found.");
        }
    }
}


