package _concept.StringAssignment;
/*8.Write a Java program to replace a specified character with another character.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown fox jumps over the lazy fog.*/
public class Ass8 {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        System.out.println("Original String:"+s);
        String sArray[]=s.split(" ");
        for(int i=0;i<sArray.length;i++)
        {
            if(sArray[i].equalsIgnoreCase("dog"))
            {
            sArray[i]="fog";
        }
    }
    String newstr=" ";
    for(int i=0;i<sArray.length;i++)
    {
        newstr+=sArray[i]+" ";
    }
    System.out.println("New String:"+newstr);
}
}
