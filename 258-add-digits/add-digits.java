class Solution {
    public int addDigits(int num) {
        while(String.valueOf(num).length()>1){
            int sum = 0;

            while(num>0){
                int digit = num%10;
                sum+=digit;
                num=num/10;
            }
            num = sum;
        }
        return num;
    }
}