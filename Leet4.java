/* Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

 */
class Leet4{
    public static void main(String[] args) {
        int[]nums={1,1,1,2,2,3};
        int k=removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
           System.out.print(nums[i]+" ");
        } 
    }
    public static int removeDuplicates(int []nums)
    {
        if(nums.length<3)
        {
            return nums.length;
        }
        int k=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[k-2])
            {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}