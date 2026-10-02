class Solution {
    static int isPalin(String s , int l, int r){
        int count = 0;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            }
            return count;
        }
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            count+= isPalin(s,i,i);
            count+= isPalin(s,i,i+1);
        }
        
        return count;
    }
}