class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String double_string = s + s;   // add s + s and check if s and goal contains same characters.

        return double_string.contains(goal); // check substring. if double string contains goal.
        
    }
}