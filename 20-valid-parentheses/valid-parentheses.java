class Solution {
    public boolean isValid(String s) {
        System.gc();
        char[] chars = s.toCharArray();
        if(chars.length == 1) return false;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<chars.length; i++){
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                st.push(chars[i]);
            }
            else{
                if(st.isEmpty()) return false;
                if(chars[i] == ')' && st.pop() != '(') return false;
                if(chars[i] == ']' && st.pop() != '[') return false;
                if(chars[i] == '}' && st.pop() != '{') return false;
            }
        }
        return st.isEmpty();
    }
}