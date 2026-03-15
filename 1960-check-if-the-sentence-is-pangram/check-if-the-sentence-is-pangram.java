class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> al = new HashSet<>();

        for(char c: sentence.toCharArray()){
            al.add(c);
        }
        return al.size()==26;
    }
}