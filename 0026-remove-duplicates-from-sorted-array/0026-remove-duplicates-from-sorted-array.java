class Solution {
    public int removeDuplicates(int[] nums) {
        
        int position = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(position < 1 || nums[i] > nums[i-1]){
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}