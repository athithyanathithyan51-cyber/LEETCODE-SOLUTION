class Solution {
    public int findPeakElement(int[] nums) {
        int peak = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                peak = i;
                break;
            }
        }
        if(peak==-1){
            peak = nums.length-1;
        }
        return peak;
    }
}