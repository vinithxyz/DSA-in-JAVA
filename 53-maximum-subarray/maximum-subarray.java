import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
        }
       if(maxsum>0){
            return maxsum;
       }  
       else{
        int smallest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>smallest){
                smallest = nums[i];
            }
        }
        return smallest;
       }   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        maxSubArray(nums);

    }
}