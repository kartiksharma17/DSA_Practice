class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int low=0; low<nums.length-3; low++){
            if(low>0 && nums[low]==nums[low-1]) continue;
            for (int high = low + 1; high < nums.length - 2; high++) {

                // Skip duplicate second element
                if (high > low + 1 && nums[high] == nums[high - 1])
                    continue;
            
                int left=high+1;
                int right=nums.length-1;
                

                while(left<right){
                    long sum = (long) nums[low] + nums[high] + nums[left] + nums[right];

                    if(sum==target){
                        ans.add(Arrays.asList(nums[low], nums[high], nums[left], nums[right]));
                        left++;
                        right--;
                        
                    
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                    }

                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            
            
        }
        return ans;
        
        
    }
}