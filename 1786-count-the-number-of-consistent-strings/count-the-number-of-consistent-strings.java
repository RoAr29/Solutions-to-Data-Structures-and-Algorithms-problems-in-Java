class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            int flag=0;
            for(int j=0;j<words[i].length();j++){
                if(!set.contains(words[i].charAt(j))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                c++;
            }
        }
        return c;
    }
}