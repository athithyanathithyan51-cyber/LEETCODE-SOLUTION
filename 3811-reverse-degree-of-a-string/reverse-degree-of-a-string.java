class Solution {
    public int reverseDegree(String s) {
        int pro = 1;
        int sum = 0;
        int n = s.length();
        int j = 1;
        int rev[] = new int[26];
        for(int i=25;i>=0;i--){
            rev[i] = j++;
        }
        for(int i=0;i<n;i++){
            pro = (i+1)*(rev[s.charAt(i)-'a']);
            sum = sum+pro;
        }
        return sum;
    }
}