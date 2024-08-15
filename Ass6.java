package _concept.StringAssignment;
/*6. Write a Java program to compare a given string to a specified string buffer.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false */
public class Ass6 {
    public static void main(String[] args) {
        String s1="example.com";
        StringBuffer sb=new StringBuffer("Example.com");
        StringBuffer sb1=new StringBuffer("example.com");
        System.out.println("Comparing:"+s1+" "+"and"+" "+sb1+":"+s1.contentEquals(sb1));
        System.out.println("Comparing:"+sb+" "+"and"+" "+1+":"+s1.contentEquals(sb));
    }
}
