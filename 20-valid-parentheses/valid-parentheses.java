class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.pop();
                
                if((ch != '{' && c == '}')){
                    return false;
                }
                else if((ch != '(' && c == ')')){
                    return false;
                }
                else if((ch != '['&& c == ']'))
                {
                    return false;
                }
            }
        } 
        return st.isEmpty();
    }
}