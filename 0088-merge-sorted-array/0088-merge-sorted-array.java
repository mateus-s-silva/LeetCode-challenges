class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int lastNums1 = m - 1;
        int lastNums2 = n - 1;
        int realLastNums1 = m + n - 1;
        
        while (lastNums2 >= 0) {
            if (lastNums1 >= 0 && nums1[lastNums1] > nums2[lastNums2]) {
                nums1[realLastNums1] = nums1[lastNums1];
                realLastNums1--;
                lastNums1--;
            } else {
                nums1[realLastNums1] = nums2[lastNums2];
                realLastNums1--;
                lastNums2--;
            }
        }
    }
}