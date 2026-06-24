class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        char target = (char)(digit + '0');

        for (int num : nums) {
            String str = Integer.toString(num);

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }
        }

        return count;
    }
}