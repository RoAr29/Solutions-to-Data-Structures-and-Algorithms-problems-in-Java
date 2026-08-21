class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int max = nums.length/2;

        for(int i : nums){
            hs.put(i, hs.getOrDefault(i, 0)+1);
            if(hs.get(i) > max) return i;
        }
        return -1;
    }
}