class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4){
            return true;
        }
        else if(n==0 || n==144 || n==400 || n==576){
            return false;
        }
        else if( Math.sqrt(n)%4==0 && n%4==0 && n>4){
            return true;
        }
        return false;
    }
}