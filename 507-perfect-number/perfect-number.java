import java.util.*;
class Solution {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0) sum = sum+i;           
            
        }
    return sum==num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPerfectNumber(num);
    }
}