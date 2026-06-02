class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char ch = t.charAt(i);

            if(map.containsKey(c)){
                if(map.get(c) != ch){
                    return false;
                }
            }
            else{
                if(map.containsValue(ch)){
                    return false;
                }
            }
            map.put(c, ch);
        }
        return true;
    }
}