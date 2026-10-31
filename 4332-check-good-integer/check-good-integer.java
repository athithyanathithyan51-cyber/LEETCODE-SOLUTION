class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sqr = 0;
        int temp = n;
        while(temp!=0){
            int s = temp%10;
            sum += s;
            sqr += s*s;
            temp/=10;
        }
        return sqr-sum >= 50;
    }
}