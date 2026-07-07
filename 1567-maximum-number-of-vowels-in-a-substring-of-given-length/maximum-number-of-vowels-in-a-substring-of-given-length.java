class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove the left character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add the new right character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}