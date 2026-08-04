class Solution {
    public boolean isPowerOfTwo(int n) {
        
         return (n&(n-1))==0 && n>0;    // logic is n=4
                                        // 4 = 100, 3=011 if we do and of 4&3 we will get 0 
       }                                // n = 8  8=1000 7=0111 8&7=0 so n&(n-1)=0 for pow of 2
 }
