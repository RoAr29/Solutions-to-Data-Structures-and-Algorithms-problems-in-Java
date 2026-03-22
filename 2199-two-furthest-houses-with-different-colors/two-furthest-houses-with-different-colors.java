class Solution {
    public int maxDistance(int[] colors) {
        int i=0, j=colors.length-1;
        int count = 0, count1 = 0;

        while(i<j){
            if(colors[i]!=colors[j]){
                count = j-i;
                break;
            }
            j--;
        }
        i=0;
        j=colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                count1 = j-i;
                break;
            }
            i++;
        }
        return Math.max(count, count1);
    }
}