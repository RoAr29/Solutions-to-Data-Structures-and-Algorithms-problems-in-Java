class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];

        int i=0, j=0;
        int ind = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                ans[ind++] = nums1[i++];
            }
            else{
                ans[ind++] = nums2[j++];
            }

        }

         while (i < nums1.length) {
            ans[ind++] = nums1[i++];
        }

        while (j < nums2.length) {
            ans[ind++] = nums2[j++];
        }

        int n = ans.length;
        if (n % 2 == 1) {
            return ans[n / 2];
        } else {
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        }
    }
}