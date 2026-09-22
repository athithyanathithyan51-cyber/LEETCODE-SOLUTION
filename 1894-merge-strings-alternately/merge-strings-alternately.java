class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        String res = "";
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        int j  = 0;
        if(n1>n2 || n1==n2){
            for(int i=0;i<n1;i++){
            res+=arr1[i];
                if(j<n2){
                    res+=arr2[j];
                    j++;
                }          
        }    
    }
    else{
            int i=0;
            for(int k=0;k<n2;k++){
                if(i<n1){
                    res+=arr1[i];
                    i++;
                }
                res+=arr2[k];
            }
        }
        return res;
}}