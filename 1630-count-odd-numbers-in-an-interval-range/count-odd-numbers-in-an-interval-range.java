class Solution {
    public int countOdds(int low, int high) {
    
         if(low%2!=0){
            low=low-1;        
            }
         if(high%2!=0){
            high = high+1;
         }


       int zerotoLow = (low)/2;
       int zerotoHigh = high/2;
      
       int odds = zerotoHigh - zerotoLow;

       return odds;

    }    
}
                                                     
// test case                                  test case
// low=3 high =7                                low=8 high=10
// since low is odd low=3-1->2                  since both low and high is even
// since high is odd high=7+1->8                low/2->4  high/2->5
//LOW/2->1 high/2->4                            5-4=1
//4-1=3