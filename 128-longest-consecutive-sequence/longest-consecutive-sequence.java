class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int longest = 0;
        for(int i:hs){
            if(!hs.contains(i-1)){
                int length = 1;

                while(hs.contains(i+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}