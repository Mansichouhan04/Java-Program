package _concept.Assignment_ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TryWithResourcesExample {

    public static void main(String[] args) {
        String filename = "example.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
    }
}
}