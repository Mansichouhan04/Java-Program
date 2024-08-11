package _concept;
 class String_ByUsingCompareToMethod {
    public static void main(String[]args){
        String s1="Yuvika";
        String s2="Yuvika";
        String s3="Mansi";
        System.out.println(s1.compareTo(s2));//it returns 0 because s1=s2.
        System.out.println(s1.compareTo(s3));// it returns positive number because(s1>s3).
        System.out.println(s3.compareTo(s1));//it returns negative number becase(s3<s1).
    }
}
