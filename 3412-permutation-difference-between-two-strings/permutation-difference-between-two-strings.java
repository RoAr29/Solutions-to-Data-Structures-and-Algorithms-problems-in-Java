class Solution {
    public int findPermutationDifference(String s, String t) {
        if(s.length() != t.length()) return -1;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            int diff = Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
            count = count + diff;
        }
        return count;
    }
}