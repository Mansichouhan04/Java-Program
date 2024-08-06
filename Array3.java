package assignment28June;

public class Array3 {
    public static void main(String[]args){
        int arr[]={11,12,13,15,16,18};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.print("the alternate array is:");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
