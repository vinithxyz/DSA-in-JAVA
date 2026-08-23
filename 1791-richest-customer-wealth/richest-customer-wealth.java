class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
       
        for(int i=0;i<accounts.length;i++){
            int currSum = 0;                       //as soon as i increments currSum will become 0
            for(int j=0;j<accounts[0].length;j++){
                currSum+=accounts[i][j];
              //  max = Math.max(max,currSum);    we can also use this but runtime will be 1ms
            }
             if(currSum>=max){                   //this is inside a for loop  and it will find the lasgest sum
                 max = currSum;
                }
        }
       
        return max;
    }
}