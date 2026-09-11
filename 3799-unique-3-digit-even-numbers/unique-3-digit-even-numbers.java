class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> hs = new HashSet<>();
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if((digits[i]!=0)&&(i!=j && j!=k && k!=i)&& digits[k]%2==0){
                        int num = digits[i]*100+digits[j]*10+digits[k];
                        hs.add(num);
                    }
            }
        } 
          
       }
       return hs.size();  
    }
}