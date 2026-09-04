class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int mid = (l+r)/2;

            if(nums[mid]>nums[mid+1]){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}

/*
Dry Run:
nums = [1, 2, 1, 3, 5, 6, 4]
        0  1  2  3  4  5  6

Initial:
l = 0
r = 6

--------------------------------------------------

Iteration 1:
mid = l + (r-l)/2
    = 0 + (6-0)/2
    = 3

nums[mid]     = nums[3] = 3
nums[mid + 1] = nums[4] = 5

3 > 5 → false

So:
l = mid + 1
l = 4

Now:
l = 4
r = 6

--------------------------------------------------

Iteration 2:
mid = 4 + (6-4)/2
    = 5

nums[mid]     = nums[5] = 6
nums[mid + 1] = nums[6] = 4

6 > 4 → true

So:
r = mid
r = 5

Now:
l = 4
r = 5

--------------------------------------------------

Iteration 3:
mid = 4 + (5-4)/2
    = 4

nums[mid]     = nums[4] = 5
nums[mid + 1] = nums[5] = 6

5 > 6 → false

So:
l = mid + 1
l = 5

Now:
l = 5
r = 5

--------------------------------------------------

Loop condition:
while(l < r)

5 < 5 → false

Loop ends.

return l;

return 5

nums[5] = 6

6 is a peak because:
5 < 6 > 4

Answer = 5
*/