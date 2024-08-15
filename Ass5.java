package _concept.StringAssignment;
/*5.Write a Java program to compare a given string to the specified character sequence.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false*/
public class Ass5 {
    public static void main(String[] args) {
        String s1="example.com";
        String s2="Example.com";
        String s3="example.com";
        System.out.println("Comparing:"+s1+" "+"and"+ " "+s3+":"+s1.equals(s3));
        System.out.println("Comparing:"+s2+" "+"and"+ " "+s1+":"+s2.equals(s1));
    }
}
