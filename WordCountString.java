package test;
//4.Wap to count a word in a string>>..
public class WordCountString {
    public static void main(String[] args) {
    String str="this is a String";
    int count=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch==' '){
            count++;
        }
    }
      System.out.println("total word in a string is:"+(count+1)); 
    }
 }
    
