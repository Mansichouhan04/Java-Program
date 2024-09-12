package test;

public class StringBalorNot {
    public static void main(String[] args) {
        int count1=0;
        int count2=0;
        String s="(((())))))";
        for(int i = 0 ; i<s.length(); i++)
        {
          if(s.charAt(i)=='('){
                count1++;
            }
            if(s.charAt(i)==')'){
                count2++;
            }
        }
        if(count1==count2){
            System.out.println("It is a balanced string");
        }
        else{
            System.out.println("it is not a balanced string");
        }
    }
}
    

