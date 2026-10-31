class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sqr = 0;
        int temp = n;
        int dup = n;
        while(temp!=0){
            int s = temp%10;
            sqr += s*s;
            temp/=10;
        }
        while(dup!=0){
            int t = dup%10;
            sum += t;
            dup/=10;
        }
        return sqr-sum >= 50;
    }
}