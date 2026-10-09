class Solution {
    public int climbStairs(int n) {
        int prev0 = 1;
        int prev1 = 2;
        if(n<=1){
            return n;
        }
        for(int i=3;i<=n;i++){
            int temp = prev0 + prev1;
            prev0 = prev1;
            prev1 = temp;
        }
        
        return prev1;
    }
}