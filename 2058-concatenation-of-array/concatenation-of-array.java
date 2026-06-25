class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int[nums.length*2];
        int idx = 0;

        for(int i:nums){
            num[idx++] = i;
        }
        for(int j:nums){
            num[idx++] = j;
        }
        return num;
    }
}