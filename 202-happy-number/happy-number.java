class Solution {
    public boolean isHappy(int n) {

        // Keep repeating until num becomes 1 or 4
        while (n != 1 && n != 4) {

            int sum = 0;

            // Extract each digit and add its square to sum
            while (n > 0) {

                // Get the last digit
                int digit = n % 10;

                // Add the square of the digit
                sum += digit * digit;

                // Remove the last digit
                n = n / 10;
            }

            // Store the sum back in n
            n = sum;
        }

        // 1 = Happy, 4 = Unhappy cycle
        return n == 1;
    }
}