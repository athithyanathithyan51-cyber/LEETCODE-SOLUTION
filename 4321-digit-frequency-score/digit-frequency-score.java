class Solution {
    public int digitFrequencyScore(int n) {
        int tot = 0;
        while(n!=0){
            int temp = n%10;
            tot+=temp;
            n=n/10;
        }
        return tot;
    }
}