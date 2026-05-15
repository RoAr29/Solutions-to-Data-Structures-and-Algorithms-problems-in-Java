class Solution {
    public double minimumAverage(int[] nums) {
        double[] nun = new double[nums.length/2];
        Arrays.sort(nums);
        int index = 0;

        int i=0, j=nums.length-1;

        while(i<j){
            nun[index++] = (nums[i] + nums[j])/2.0;
            i++;
            j--;
        }
        Arrays.sort(nun);
        return nun[0];
    }
}