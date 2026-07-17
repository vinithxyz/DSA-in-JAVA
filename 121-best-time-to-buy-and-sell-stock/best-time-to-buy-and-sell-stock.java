import java.util.*;
class Solution {
    public static int maxProfit(int[] prices) {
        int maxprice = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxprice = Math.max(maxprice,profit);
            }
            else{
                buyPrice = prices[i];
            }

        }
        return maxprice;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        maxProfit(prices);
    }
}