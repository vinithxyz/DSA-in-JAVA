class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String double_string = s + s;

        return double_string.contains(goal);
        
    }
}