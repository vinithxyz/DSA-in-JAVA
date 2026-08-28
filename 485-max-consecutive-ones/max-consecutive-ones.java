class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int freq = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                freq = 0;
            }
            else{
                freq++;
            }
            max = Math.max(max,freq);

        }
        return max;
    }
}