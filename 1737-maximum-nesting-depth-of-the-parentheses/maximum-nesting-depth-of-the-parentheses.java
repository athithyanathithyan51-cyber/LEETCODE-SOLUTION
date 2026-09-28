class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int digit = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if('('== s.charAt(i)){
                digit++;
                max = Math.max(digit,max);
            }
            if(s.charAt(i)==')'){
                digit--;
            }
            else{
                continue;
            }
        }
        return max;
    }
}