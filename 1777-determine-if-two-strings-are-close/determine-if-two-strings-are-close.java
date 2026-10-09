class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> set1 = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            set1.put(ch, set1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            set2.put(ch, set2.getOrDefault(ch, 0) + 1);
        }

        if (!set1.keySet().equals(set2.keySet())) {
            return false;
        }

        List<Integer> v1 = new ArrayList<>(set1.values());
        List<Integer> v2 = new ArrayList<>(set2.values());
        Collections.sort(v1); 
        Collections.sort(v2);
        return v1.equals(v2);
    }
}