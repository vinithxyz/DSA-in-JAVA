import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[] = new char[s.length()];
        char t1[] = new char[t.length()];

        if (s.length() != t.length()) {
                return false;
            }

        for(int i=0;i<s.length();i++){
            s1[i] = s.charAt(i);
            t1[i] = t.charAt(i);
        }
       
        Arrays.sort(s1);
        Arrays.sort(t1);

     return Arrays.equals(s1, t1);        
    }
}