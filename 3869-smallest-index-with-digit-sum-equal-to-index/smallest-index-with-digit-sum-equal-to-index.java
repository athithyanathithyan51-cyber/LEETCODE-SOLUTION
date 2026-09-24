class Solution {
    public int smallestIndex(int[] nums) {
        int index = -1;
       for(int i=0;i<nums.length;i++){
            if(nums[i]<10 && i==nums[i]){
                index = i;
                return index;
            }
            else if(nums[i]>=10){
                int num = nums[i];
                int sum =0 ;
                while(num!=0){
                    int temp = num%10;
                    sum+=temp;
                    num = num/10;
                }
                if(sum==i){
                    index = i;
                    return index;
                }
            }
       } 
    return index;
    }
}