import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        int rem;

        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();
       

        if(isPalindrome(x)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}