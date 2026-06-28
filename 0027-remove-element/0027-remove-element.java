class Solution {
    public int removeElement(int[] nums, int val) {
        
        int low=0;
        int k=0;
        
        while(low<nums.length){
            

            if(nums[low]!=val){
                nums[k]=nums[low];
                k++;

                
                
            }
            low++;
            

        }
        return k;
        
    }
}