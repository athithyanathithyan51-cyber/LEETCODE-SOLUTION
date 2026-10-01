class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int left = 0;
        
        int right = nums.size()-1;
        int j=0;
        int[] arr = new int[nums.size()];
        for(int i:nums){
            arr[j] = i;
            j++;
        }Arrays.sort(arr);
        int pairs = 0;
        while(left<right){
            if(arr[left]+arr[right]<target){
                pairs+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return pairs;
    }
}