class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int[] arr = new int[26];
       for(char c : allowed.toCharArray()){
            arr[c-'a']++;
       }
       int count=0;
       for(String s : words){
        count+=countofconstring(s,arr);
       }
        return count;
    }
    private static int countofconstring(String s,int[] arr){
        int flag = 1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i) - 'a'] == 0){
                flag = 0;
                break;
            }
        }
        return flag;
    }
}