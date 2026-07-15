import java.util.*;
class Solution {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0,i=1;
        while(i*2<=num){
            if(num%i==0) sum+=i;
            i++;
        }
        
    return sum==num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPerfectNumber(num);
    }
}