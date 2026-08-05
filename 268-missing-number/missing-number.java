class Solution {
    public int missingNumber(int[] nums) {
        int ans;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            ans =i^nums[i];
            if(ans != 0){
                return i;
            }
           
        }
    return nums.length;
    }
}