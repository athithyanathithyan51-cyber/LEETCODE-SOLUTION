class Solution {
    static boolean func(String s , int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int n = s.length();
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return func(s,l+1,r) || func(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }

}