class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0) + 1);

            if(hs.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}