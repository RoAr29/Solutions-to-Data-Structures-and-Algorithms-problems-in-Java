class Solution {
    public int reverseDegree(String s) {
        int deg = 0;

        for(int i=0; i<s.length(); i++){
            deg = deg + (123 - s.charAt(i)) * (i+1);
        }
        return deg;
    }
}