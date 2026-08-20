class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i:nums){
            hs.put(i, hs.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>(hs.keySet());

        list.sort((a,b) -> hs.get(b) - hs.get(a));

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}