package _concept.StringAssignment;
/*7. Write a Java program to check whether two String objects contain the same data.
Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false
 */
public class Ass7 {
    public static void main(String[] args) {
        String s1="Stephen Edwin King";
        String s2="Walter Winchell";
        String s3="Mike Royko";
        String s=new String("Stephen Edwin King");
        System.out.println(s+" " +"equals"+" "+s2+": "+ s.equals(s2));
        System.out.println(s+" " +"equals"+" "+s3+": "+ s.equals(s3));
    }
}
