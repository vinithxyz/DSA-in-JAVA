class Solution {
    public int addDigits(int num) {

        // Keep repeating until num becomes a single digit
        while (num > 9) {

            int sum = 0;

            // Extract each digit and add it to sum
            while (num > 0) {

                // Get the last digit
                int digit = num % 10;

                // Add the digit to sum
                sum += digit;

                // Remove the last digit
                num = num / 10;
            }

            // Store the sum back in num
            num = sum;
        }

        // Return the single-digit result
        return num;
    }
}


/*
1. num = num / 10 removes one digit each time.
2. So the loop runs once for every digit in num.
3. A number n has about log₁₀(n) digits.
4. Therefore, time complexity is O(log n).
5. Space complexity is O(1) because we use only variables.
*/