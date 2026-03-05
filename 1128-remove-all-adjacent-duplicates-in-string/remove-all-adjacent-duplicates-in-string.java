import java.util.*;

class Solution {
    public String removeDuplicates(String s) {

        ArrayList<Character> al = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            al.add(s.charAt(i));
        }

        for(int i=1; i<al.size(); i++){
            if(al.get(i) == al.get(i-1)){
                al.remove(i);
                al.remove(i-1);
                i = Math.max(0, i-2);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : al){
            sb.append(c);
        }

        return sb.toString();
    }
}