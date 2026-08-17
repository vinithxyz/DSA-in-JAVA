class Solution {
    public int thirdMax(int[] nums) {

        long firstlargest = Long.MIN_VALUE;
        long seclargest = Long.MIN_VALUE;
        long thirdlargest = Long.MIN_VALUE;

        int count = 0;

        for (int num : nums) {

            // Skip duplicates
            if (num == firstlargest ||
                num == seclargest ||
                num == thirdlargest) {
                continue;
            }

            count++;

            if (num > firstlargest) {
                thirdlargest = seclargest;
                seclargest = firstlargest;
                firstlargest = num;
            }
            else if (num > seclargest) {
                thirdlargest = seclargest;
                seclargest = num;
            }
            else if (num > thirdlargest) {
                thirdlargest = num;
            }
        }

        if (count < 3) {
            return (int) firstlargest;
        }

        return (int) thirdlargest;
    }
}