class Solution {
    static int function(int nums[],int l,int r,int t){
        if(l>r){
            return -1;
        }
        int mid = l+(r-l)/2;
        if(nums[mid]==t){
            return mid;
        }
        else if(nums[mid]<t){
            return function(nums,mid+1,r,t);
        }
        else{
            return function(nums,l,mid-1,t);
        }
    }
    public int search(int[] nums, int target) {
        return function(nums,0,nums.length-1,target);
    }
    
}