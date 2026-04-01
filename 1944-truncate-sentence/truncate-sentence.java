class Solution {
    public String truncateSentence(String s, int k) {
        String[] parts = s.split(" ");
        String[] p = new String[k];
        int index = 0;

        for(int i=0; i<k; i++){
            p[index++] = parts[i];
        }
        String result = String.join(" ", p);
        return result;
    }
}