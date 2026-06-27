class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        int n =nums.length;
        for(int high=0; high<n; high++){
            sum=sum+nums[high];

            while(sum>=target ){
                min=Math.min(min, high-low+1);
                sum=sum-nums[low];
                low++;
            }
            
        }
        if(min == Integer.MAX_VALUE ) return 0;
       
        
        return min;
        
        
        
    }
}