class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length-1;
        int i=0, count = 0, max = 0;

        while(i<=n){
            if(seats[i]!=students[i]){
                count += Math.abs(students[i]-seats[i]);
            }
            i++;
        }
        return count;
    }
}