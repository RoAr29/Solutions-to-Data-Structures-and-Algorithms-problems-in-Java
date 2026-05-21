class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);

            if(hs.get(num) == nums.length/3 + 1){
                al.add(num);
            }
        }

        return al;
    }
}