class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int count = 0;
        int r = piles.length;

        for(int i=0; i<piles.length/3; i++){
            count += piles[r-2];
            r -= 2;
        }
        return count;
    }
}