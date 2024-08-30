package _concept.Exception_handling;

public class ArrayException {
    public static void main(String[] args) {
        int a[]={10,20,30};
        System.out.println("Start");
        try{
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Rest of the code");
    }
    
}
