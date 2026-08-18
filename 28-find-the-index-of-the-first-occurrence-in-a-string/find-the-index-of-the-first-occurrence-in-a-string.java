class Solution {
    public int strStr(String haystack, String needle) {
        int i=0, j=needle.length();

        while(j<=haystack.length()){
            String s = haystack.substring(i, j);
            if(s.equals(needle)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}