package _concept.StringAssignment;
/* 10.	Write a Java program to convert all characters in a string to lowercase.
Sample Output:
Original String: The Quick BroWn FoX!                                                                         
string in lowercase: the quick brown fox!
 */
public class Ass10 {
    public static void main (String[]args)
    {
        String OriginalString="The Quick BroWn FoX! ";
        System.out.println("The original String is:"+OriginalString);
        String lowercaseString=OriginalString.toLowerCase();
        System.out.println("The lowercase String is:"+lowercaseString);
    }
}
