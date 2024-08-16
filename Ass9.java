package _concept.StringAssignment;
/*9.Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog. 
 */
public class Ass9 {
    public static void main(String[] args) {
        String s="The Quick brown fox jumps over the lazy dog.";
        System.out.println("Original String:"+s);
        String strArray[]=s.split(" ");
        for(int i=0;i<strArray.length;i++)
        {
          if(strArray[i].equalsIgnoreCase("fox"))
          {
            strArray[i]="cat";
          } 
        }
        String newstr="";
        for(int i=0;i<strArray.length;i++)
        {
            newstr+=strArray[i]+" ";
        }
        System.out.println("New String:"+newstr);
    }
}
