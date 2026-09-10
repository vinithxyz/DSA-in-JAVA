class Solution {
    public boolean areNumbersAscending(String s) {

        // Stores the previous number we found
        // Start with 0 because all numbers are positive
        int previous = 0;

        // Used to build a complete number
        // Example: for "12", it first stores "1", then "12"
        String num = "";

        // Go through every character in the string
        for(int i = 0; i < s.length(); i++) {

            // Check if the current character is a digit
            if(Character.isDigit(s.charAt(i))) {

                // Add the digit to num
                // Example: '1' → "1", then '2' → "12"
                num += s.charAt(i);
            }

            // If current character is NOT a digit
            // and num is not empty, we have found a complete number
            else if(!num.isEmpty()) {

                // Convert the number from String to int
                int current = Integer.parseInt(num);

                // Current number must be GREATER than previous number
                // If current <= previous, numbers are NOT increasing
                if(current <= previous) {
                    return false;
                }

                // Current number becomes the previous number
                // for the next comparison
                previous = current;

                // Reset num so we can build the next number
                num = "";
            }
        }

        // If the last token is a number,
        // there is no space/letter after it to enter the else-if above
        if(!num.isEmpty()) {

            // Convert the last number from String to int
            int current = Integer.parseInt(num);

            // Check if the last number is greater than previous
            if(current <= previous) {
                return false;
            }
        }

        // If we never found a number that breaks the order,
        // all numbers are strictly increasing
        return true;
    }
}