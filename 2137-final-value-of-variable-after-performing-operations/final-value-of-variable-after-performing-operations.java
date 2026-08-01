class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            String op = operations[i];
            if(op.charAt(1)=='+'){
                 x+=1;
            }
            if(op.charAt(1)=='-'){
                x-=1;
            }
            
        }
        return x;
        
    }
}