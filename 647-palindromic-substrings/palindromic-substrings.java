class Solution {
    static boolean isPalin(String s , int l, int r){
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalin(s,i,j)){
                    count++;
                }
            }
        }
        
        return count;
    }
}