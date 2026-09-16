class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        int low=0;
        int dups=0;
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                low++;
            }
            if(nums[i]==target){
                dups++;
            }
        }
        for(int i=0;i<dups;i++){
            ls.add(low++);
        }
        return ls;
    }
}