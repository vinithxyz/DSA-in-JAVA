class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
                                                        
        for(int i=0;i<=n;i++){                      //Dry run //ans[i] = ans[i >> 1] + (i&1)
            ans[i]=ans[i >> 1] + (i&1);             //0->0+0  == 0
                                                    //1->0+1  == 1
        }                                           //2->1+0  == 1
                                                    //3->1+1  == 2
        return ans;                                 //4->1+0  == 1
    }
}





 





