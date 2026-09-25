class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n-1;
        int maxArea = -1;
        while(left<=right){
            int l = Math.min(height[left],height[right]);
            int w = right-left;
            int area = l*w;
            maxArea = Math.max(area,maxArea);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}