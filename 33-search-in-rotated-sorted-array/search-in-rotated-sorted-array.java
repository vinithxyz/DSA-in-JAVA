class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
       

        while(l<=r){
            //finds middle element
            int mid = (l+r)/2;

            // target found
            if(nums[mid]==target){
                return mid;
            }

            //check the left sorted part
            if(nums[l]<=nums[mid]){
                
                //is the target inside sorted left part
                if(nums[l]<=target && target<nums[mid]){ 
                    r = mid-1; //search left
                }
                else{
                    l = mid+1; //search right
                }
            }

            //checks the right sorted part
            else{
                //is the target inside the right sorted part 
                if(nums[mid]<target && target<=nums[r]){
                    l=mid+1; //search right  
                }
                else{
                    r = mid-1; //search left
                }
            }
          
        }
        // target not found
        return -1;
    }
}