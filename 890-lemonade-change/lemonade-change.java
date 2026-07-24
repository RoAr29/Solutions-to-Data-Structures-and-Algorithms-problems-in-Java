class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int ten = 0;
        int five = 0;
        int i = 0;

        while(i<bills.length){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                ten++;
                if(five>0){
                    five--;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>2){
                    five = five-3;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return true;

    }
}