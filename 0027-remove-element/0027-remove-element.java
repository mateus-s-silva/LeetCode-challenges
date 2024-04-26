class Solution {
    public int removeElement(int[] nums, int val) {
        int sizeArray = nums.length - 1;
        int aux, idx = 0;
        
        while(idx <= sizeArray){
            if(nums[idx] == val){
                aux = nums[sizeArray];
                nums[sizeArray] = nums[idx];
                nums[idx] = aux;
                sizeArray--;
            }
            else{
                idx++;
            }
        }
        return idx;
    }
}