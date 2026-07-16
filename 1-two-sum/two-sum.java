import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if( nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        twoSum(nums,target);
    }
}