class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] al1 = new int[friends.length];
        int index = 0;

        for(int i=0; i<friends.length; i++){
            al.add(friends[i]);
        }

        for(int i=0; i<order.length; i++){
            if(al.contains(order[i])){
                al1[index++] = order[i];
            }
        }
        return al1;
    }
}