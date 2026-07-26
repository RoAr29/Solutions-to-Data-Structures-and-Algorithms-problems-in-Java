class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int secondVal = target - nums[i];

            if(hs.containsKey(secondVal)){
                return new int[]{i,hs.get(secondVal)};
            }

            hs.put(nums[i], i);
        }

        return new int[]{};
    }
}