class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int num = 0;
        for(int i=0;i<n;i++){
            arr[nums[i]]++; 
            if(arr[nums[i]]>1){
                num = nums[i];
            }
        }
        return num;
    }
}