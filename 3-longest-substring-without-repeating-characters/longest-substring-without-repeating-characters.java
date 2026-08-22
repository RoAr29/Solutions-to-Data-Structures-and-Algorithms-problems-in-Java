class Solution {
    public int lengthOfLongestSubstring(String s) {
        int high = 0;
        int low = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();


        while(high < s.length()){
            while(hs.contains(s.charAt(high))){

                hs.remove(s.charAt(low));
                low++;
            }
            hs.add(s.charAt(high));
            high++;

            max = Math.max(max, hs.size());
        }
        return max;
    }
}