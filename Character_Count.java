package _concept.Array_StringPractice;

public class Character_Count {
    public static void main(String[] args) {
        String s="Hello123";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&& s.charAt(i)<='z'){
                count++;
            }
        }
        System.out.println("The character count is:"+count);
    }
}
