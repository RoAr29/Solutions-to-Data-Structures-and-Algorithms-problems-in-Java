class Solution {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> exp = new ArrayList<>();
        for(int i=0; i<heights.length; i++){
            exp.add(heights[i]);
        }
        
        Arrays.sort(heights);

        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(exp.get(i)!=heights[i]){
                count++;
            }
        }
        return count;
    }
}