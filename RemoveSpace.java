package test;
//6.Wap t remove a space in a string>>....
class RemoveSpace{
    public static void main(String[] args) {
        String s="Hello world";
        System.out.println("The original String is:"+s);
        String newstr=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                newstr+=s.charAt(i);
            }
        }
        s=newstr;
        System.out.println("After the remove space:"+s);

    }
}