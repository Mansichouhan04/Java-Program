package assignment28June;

public class Array1 {
    public static void main (String[]args){
    int arr1[]={22,32,45,22,56,22,78};
    int maxCount=0;
    int maxValue=0;
           for( int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
           int count=0;
           for( int j=0;j<arr1.length;j++){
            if(arr1[i]==arr1[j]){
                count++;
           }
        }
        if(count>maxCount){
            maxCount=count;
            maxValue=arr1[i];
        }
    }
           System.out.println("The value that has occurred the maximum number of time is:" + " "+ maxValue + " "+ "count of" + " " + maxCount);
}
}