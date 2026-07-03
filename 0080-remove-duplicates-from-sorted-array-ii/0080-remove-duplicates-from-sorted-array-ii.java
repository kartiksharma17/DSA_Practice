class Solution {
    public int removeDuplicates(int[] nums) {
        int high=1;
        int low=0;
        int count =1;
        int occ=0;
        
        
        while(high<nums.length){
            if(nums[high]==nums[low]){
                occ++;
                if(occ==1){
                    nums[low+1]=nums[high];
                    low++;
                    
                    count++;
                    
                }

                high++;
                
                  
               
            }
            else{
                nums[low+1]=nums[high];
                
                low++;
                high++;
                count++;
                occ=0;
            }


        }
        return count;

    }
}