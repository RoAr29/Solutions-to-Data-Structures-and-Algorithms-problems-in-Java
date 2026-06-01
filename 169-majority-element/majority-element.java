class Solution {
    public int majorityElement(int[] nums) {
        int cnd = 0;
        int count = 0;

        for(int i : nums){
            if(count == 0){
                cnd = i;
                count = 1;
            }
            else if(i == cnd){
                count++;
            }
            else{
                count--;
            }
        }
        return cnd;
    }
}