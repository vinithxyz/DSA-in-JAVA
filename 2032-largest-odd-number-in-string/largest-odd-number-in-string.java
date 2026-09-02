class Solution {
    public String largestOddNumber(String num) {  //redo
        int n = num.length();
        int lc = -1;
      
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)=='1' || num.charAt(i)=='3' || num.charAt(i)=='5' || num.charAt(i)=='7' || num.charAt(i)=='9'){
                lc = i;
                break;
            }
        }
        if(lc==-1){
            return "";
        }
       
        return num.substring(0,lc+1);
    }
}