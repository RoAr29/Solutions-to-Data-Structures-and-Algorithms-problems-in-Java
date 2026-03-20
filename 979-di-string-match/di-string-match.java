class Solution {
    public int[] diStringMatch(String s) {
        int index = 0;
        int[] num = new int[s.length()+1];
        ArrayList<Integer> al = new ArrayList<>();

        int i = 0, d = s.length();
        for(int j=0; j<=s.length(); j++){
            al.add(j);
        }
        int n=0;
        while(i<d){
            if(s.charAt(n)=='I'){
                num[index++] = al.get(i);
                i++;
            }
            else{
                num[index++] = al.get(d);
                d--;
            }
            n++;
        }
        num[index++]=al.get(i);
    return num;
    }
}