class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            al.add(nums1[i]);
        }
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0; i<nums2.length; i++){
            if(al.contains(nums2[i])){
                al2.add(nums2[i]);
                al.remove((Integer) nums2[i]);
            }
        }

        int[] num3 = new int[al2.size()];

        for(int i=0; i<al2.size(); i++){
            num3[i] = al2.get(i);
        }
        return num3;
    }
}