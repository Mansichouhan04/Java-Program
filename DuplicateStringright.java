package basics;

public class DuplicateStringright {
    public static void main(String[] args) {
        String s1="Great Responsibility";
        int count;
        System.out.println("The string is:"+s1);
        char[]s=s1.toCharArray();
        System.out.print("The duplicate character in a string is::");
        for(int i=0;i<s.length;i++){
            count=1;
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j] && s[i]!=' '){
                    count++;
                    s[j]='0';
                }
            }
            if(count>1 &&s[i]!='0'){
                System.out.print(s[i]);
            }

        }
    }
    
}
