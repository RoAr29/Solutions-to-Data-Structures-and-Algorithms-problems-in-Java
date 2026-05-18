class Solution {
    public int minTimeToType(String word) {
        int n = word.length();

        char curr = 'a';

        int time = 0;
        for(int i=0; i<n; i++){
            char c = word.charAt(i);
            int diff = Math.abs(c - curr);
            time += 1+Math.min(diff, 26-diff);
            curr = c;
        }
        return time;
    }
}