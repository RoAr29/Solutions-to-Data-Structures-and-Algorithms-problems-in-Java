class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[2];
        int index = 0;
        for(int num : nums){
            if(map.get(num) == 2){
                res[index++] = num;
                map.put(num,0);
            }
        }
        return res;
    }
}