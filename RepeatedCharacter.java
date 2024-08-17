package _concept.Array_StringPractice;
//write a program to most repeated character in a string.>>>>>>
public class RepeatedCharacter {
    public static void main(String[] args) {
        String str="test String";
        char mostfrequentchar=' ';
        int max=0;
        System.out.println("The String is:"+str);
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
                if(count>max){
                    max=count;
                    mostfrequentchar=str.charAt(i);
                }
            }
        }
        System.out.println("The most reapeted character is:"+mostfrequentchar);
    }
    
}
