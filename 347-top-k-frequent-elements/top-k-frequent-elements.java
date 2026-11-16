class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i:nums){
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> nem = new PriorityQueue<>((a, b) -> hs.get(b) - hs.get(a));
        
        nem.addAll(hs.keySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nem.poll();
        }
        return result;
    }
}