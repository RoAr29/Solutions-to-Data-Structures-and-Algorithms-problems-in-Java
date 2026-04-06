class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ash = new int[nums.length];
        int i=0, j=n;
        int index=0;

        while(i<n){
            ash[index++] = nums[i];
            ash[index++] = nums[j];
            i++;
            j++;
        }
        return ash;
    }
}