package Mypakage_acess;
//42.Create an array of the first 10 positive integers.>>
public class ArrayPositiveInteger {
    public static void main(String[] args) {
        int[]array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=i+1;
        }
        System.out.println("Array of the first 10 integers: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
