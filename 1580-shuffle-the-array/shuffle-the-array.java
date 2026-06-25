class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0; 
        int j=nums.length/2;
        int[] num = new int[nums.length];
        int idx = 0;

        while(j<nums.length){
            num[idx++] = nums[i];
            num[idx++] = nums[j];
            i++;
            j++;
        }
        return num;
    }
}