class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%3 != 0){
                al.add(nums[i]);
            }
        }
        return al.size();
    }
}