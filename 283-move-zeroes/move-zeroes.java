class Solution {
    public void moveZeroes(int[] nums) {

        int elf = 0;

        for(int elleth = 0; elleth < nums.length; elleth++){
            if(nums[elleth] != 0){
                int temp = nums[elleth];
                nums[elleth] = nums[elf];
                nums[elf] = temp;
                elf++;
            }
        }
    }
}