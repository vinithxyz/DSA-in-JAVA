import java.util.*;
class Solution {
    public static void moveZeroes(int[] nums) {
         int left = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();    
            }
         moveZeroes(nums);
 
    }
    
}