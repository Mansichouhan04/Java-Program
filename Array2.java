package assignment28June;
 class Array2{
    public static void main(String[]args){
        int arr[]={11,12,13,15,16,17};
       findMissingElement(arr,11,17);
     //System.out.println("The missing element is="+findMissingElement);
    }
    public static void findMissingElement(int arr[],int start,int end)
    {

        for(int i =start;i<=end;i++)
        {
            boolean found=false;
            for (int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
               System.out.println("The missing element in an array is="+i);
            }
        }
    }
}
 
