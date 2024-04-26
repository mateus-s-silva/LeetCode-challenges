class Solution {
    public int removeElement(int[] nums, int val) {
        int sizeArray = nums.length - 1;
        int aux, idx = 0;
        
        // [3(idx), 2, 2, 3(sizeArray-1)]  
        // primeira interação: [3(idx), 2, 2(sizeArray), 3]
        // segunda interação: [2, 2(sizeArray, idx), 3, 3]
        // terceira interação: 
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