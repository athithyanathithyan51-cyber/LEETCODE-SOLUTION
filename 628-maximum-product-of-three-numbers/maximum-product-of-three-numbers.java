class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[0]*nums[1]*nums[n-1];
        int last  = nums[n-1]*nums[n-2]*nums[n-3];
        int max = Math.max(first,last);
        return max;
    }
}