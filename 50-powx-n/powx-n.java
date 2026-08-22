class Solution {
    public double myPow(double x, int n) {

        // Convert n to long because Integer.MIN_VALUE
        // cannot be safely converted to positive int
        long power = n;

        // If power is negative:
        // x^(-n) = 1 / x^n
        if (power < 0) {
            return 1 / fastPow(x, -power);
        }

        // Calculate x^power normally
        return fastPow(x, power);
    }

    // Fast exponentiation using recursion
    private double fastPow(double x, long n) {

        // Any number raised to 0 is 1
        if (n == 0) {
            return 1;
        }

        // Calculate x^(n/2)
        double halfsq = fastPow(x, n / 2);

        // Square the result
        double result = halfsq * halfsq;

        // If n is odd, multiply by x one extra time
        if (n % 2 != 0) {
            result = x * result;
        }

        return result;
    }
}