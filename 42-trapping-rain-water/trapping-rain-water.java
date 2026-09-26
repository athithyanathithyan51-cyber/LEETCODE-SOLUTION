class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int pre[] = new int[n];
        int suf[] = new int[n];
        pre[0] = height[0];
        suf[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            pre[i] = Math.max(pre[i-1],height[i]);
        }
        for(int j=n-2;j>=0;j--){
            suf[j] = Math.max(suf[j+1],height[j]);
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total += Math.min(pre[i],suf[i])-height[i];
        }
        return total;
    }
}