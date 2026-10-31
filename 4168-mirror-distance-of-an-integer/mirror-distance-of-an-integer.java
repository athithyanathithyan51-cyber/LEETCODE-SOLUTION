class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int dup = temp%10;
            rev = rev * 10 + dup;
            temp/=10;
        }
        int res = Math.abs(n - rev);
        return res;
    }
}