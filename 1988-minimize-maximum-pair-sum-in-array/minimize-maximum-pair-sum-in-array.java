class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        int[] av = new int[nums.length/2];
        int index = 0;

        while(i<j){
            av[index++] = nums[i] + nums[j];
            i++;
            j--;
        }

        int max = 0;

        for(int k:av){
            max = Math.max(max, k);
        }
        return max;
    }
}