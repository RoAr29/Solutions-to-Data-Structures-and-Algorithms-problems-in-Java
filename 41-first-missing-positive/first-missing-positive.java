class Solution {
    public int firstMissingPositive(int[] nums) {
       int[] pos = Arrays.stream(nums).filter(n -> n > 0).toArray();

       Arrays.sort(pos);

       int target = 1;

       for(int n : pos){
        if(n==target){
            target++;
        }else if(n>target){
            return target;
        }
       }
       return target;
    } 
}