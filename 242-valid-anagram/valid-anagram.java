class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> hs1 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char c1 = t.charAt(i);

            hs1.put(c1, hs1.getOrDefault(c1, 0) + 1);
        }

        return hs.equals(hs1);
    }
}