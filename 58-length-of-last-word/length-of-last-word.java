class Solution {
    public int lengthOfLastWord(String s) {
        char ans;
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                continue;
            }
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
            if(i>0 && Character.isLetter(s.charAt(i)) && s.charAt(i-1)==' ' ){
                break;
            }
        }
        return count;
    }
}