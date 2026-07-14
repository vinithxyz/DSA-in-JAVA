import java.util.*;
class Solution {
    public static boolean isPowerOfTwo(int n) {
        int i=0;
        for(i=0;i<31;i++){
             int x = (int)Math.pow(2,i);
             if(n==x) return true;
            }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPowerOfTwo(n);
    }
}