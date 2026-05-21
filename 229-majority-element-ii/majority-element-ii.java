class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        HashSet<Integer> al = new HashSet<>();

        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);

            if(hs.get(num) > nums.length/3){
                al.add(num);
            }
        }

        ArrayList<Integer> all = new ArrayList<>();
        for(int n:al){
            all.add(n);
        }
        return all;
    }
}