class Solution {
    public int getLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        int[] num = nums;

        for (int left = 0; left < n; left++) {

            Map<Integer, Integer> freq = new HashMap<>();
            Map<Integer, Integer> freqCount = new HashMap<>();

             for (int right = left; right < n; right++) {

                int x = nums[right];

                int oldFreq = freq.getOrDefault(x, 0);

                if (oldFreq > 0) {
                    freqCount.put(oldFreq,
                            freqCount.get(oldFreq) - 1);

                    if (freqCount.get(oldFreq) == 0) {
                        freqCount.remove(oldFreq);
                    }
                }
                 int newFreq = oldFreq + 1;

                freq.put(x, newFreq);

                freqCount.put(
                        newFreq,
                        freqCount.getOrDefault(newFreq, 0) + 1
                );

                if (isBalanced(freqCount)) {
                    ans = Math.max(ans, right - left + 1);
                }
            }
        }
        return ans;
    }

    private boolean isBalanced(Map<Integer, Integer> freqCount) {

    if (freqCount.size() == 1) {

        int frequency =
                freqCount.keySet().iterator().next();

        return freqCount.get(frequency) == 1;
    }

    if (freqCount.size() != 2) {
        return false;
    }

    List<Integer> freqs =
            new ArrayList<>(freqCount.keySet());

    int f1 = freqs.get(0);
    int f2 = freqs.get(1);

    int maxFreq = Math.max(f1, f2);
    int minFreq = Math.min(f1, f2);

    return maxFreq == 2 * minFreq;
}
}