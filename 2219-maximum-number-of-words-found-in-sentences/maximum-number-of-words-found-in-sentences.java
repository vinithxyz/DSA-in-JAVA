class Solution {
    public int mostWordsFound(String[] sentences) {
        String ans;
        int count;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            count = 0;
            ans = sentences[i];
            for(int j=0;j<ans.length();j++){
                if(ans.charAt(j)== ' '){
                    count++;
                }
                max = Math.max(count,max);

            }
        }
        return max+1;
    }
}