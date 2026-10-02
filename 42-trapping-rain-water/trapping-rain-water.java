class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int l_max  = height[l];
        int r_max = height[r];
        int water  =0;
        while(l<r){
            if(l_max < r_max){
                l++;
                l_max = Math.max(l_max,height[l]);
                water+=l_max - height[l];
            }
            else{
                r--;
                r_max = Math.max(height[r],r_max);
                water+=r_max - height[r];
            }
        }
        return water;
    }
}