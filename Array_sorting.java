package test;
//1.Array sort in asscending order>>>>...
 class _143SortInAscending2 {
    public static void main(String[] args) {
    int[] arr = {4, 6, 1, 3, 9};
    for (int i = 0; i < arr.length - 1; i++) {
    for (int j = i+1; j < arr.length ; j++) {
    if (arr[i] > arr[j]) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    }
    }
   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
    }
    }
}   
    