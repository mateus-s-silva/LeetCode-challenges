class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        // array nums1 and array nums2 in non-decreasing orde
        // m is nums1.size and n is nums2.size
        // the return must be array nums1 in crescent order
        // nums1 has a lenght of m+n
        
        
        var lastNums1 = m - 1;
        var lastNums2 = n - 1;
        var realLastNums1 = m + n - 1;
        
        
        while(lastNums2 >= 0){
            if(lastNums1 >= 0 && nums1[lastNums1] >= nums2[lastNums2]){
                nums1[realLastNums1] = nums1[lastNums1];
                lastNums1--;
                realLastNums1--;
            }
            else{
                nums1[realLastNums1] = nums2[lastNums2];
                lastNums2--;
                realLastNums1--;
            }
        } 
    }
}
