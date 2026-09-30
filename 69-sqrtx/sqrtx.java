class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long left = 0;
        long right = x/2;
        while(left<=right){
            long mid = left+(right-left)/2;
            long sq = mid*mid;
            if(sq==x){
                return (int)mid;
            }
            else if(sq<x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return (int) right;
    }
}