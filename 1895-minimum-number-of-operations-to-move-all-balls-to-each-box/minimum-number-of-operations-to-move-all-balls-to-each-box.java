class Solution {
    public int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int[] al = new int[chars.length];

        for(int i = 0; i < chars.length; i++){
            int sum = 0;

            for(int j = 0; j < chars.length; j++){
                if(chars[j] == '1'){
                    sum += Math.abs(j - i);
                }
            }

            al[i] = sum;
        }

        return al;
    }
}