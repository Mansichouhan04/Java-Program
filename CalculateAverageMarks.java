//Create a HashMap to store 4 students' names as keys and their marks as values. Calculate the average marks and print it.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 class StudentMarksAverage {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("John", 85);
        students.put("Emily", 90);
        students.put("Alex", 78);
        students.put("Sophia", 88);
        System.out.println("the name and the marks is::"+students);
        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();
        int totalMarks = 0;
        for (int marks : students.values()) {
            totalMarks += marks;
        }
        double average = totalMarks / (double) students.size();
        System.out.println("Average Marks: " + average);
    }
}
