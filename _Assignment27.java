package _concept.Assignment_ExceptionHandling;

class NoVowelException extends Exception {
    public NoVowelException(String msg){
        super(msg);
    }
}
class Main{
    public static void main(String[]args){
    try{
        checkVowels("aeiou");
        checkVowels("png");
    }
    catch(NoVowelException e){
        System.out.println(e);
        System.out.println(e.getMessage());
    }
    }
    public static void checkVowels(String str)throws NoVowelException{
        boolean vowelPresent=false;
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            checkVowels("Mmm");
            checkVowels("aeiou") ;     
            }
        else{
            throw new NoVowelException("The string does not contain any vowels.");
        }
        }
    }
}
