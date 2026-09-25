class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        int one =0 ;
        int two =0 ;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int j = 0;
        while(zeros>0){
            nums[j] = 0;
            j++;
            zeros--;
        }
        while(one>0){
            nums[j] = 1;
            j++;
            one--;
        }
        while(two>0){
            nums[j] = 2;
            j++;
            two--;
        }
    }
}